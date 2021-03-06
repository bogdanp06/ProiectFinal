package Camere;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Bucatarie extends Temperatura implements InchCaldura{

    private static Bucatarie instance;
    public List<Double> veziEvolutie;

    private static int counter;

    public JPanel PanelBucatarie;
    private JLabel lblInfo;
    private JLabel lblTempActuala;
    private JLabel lblAfisTempActuala;
    private JLabel lblTempMinima;
    private JTextField txtTempMinima;
    private JTextField txtTempMaxima;
    private JButton btnModificareTemperatura;
    private JPanel panelGrafic;
    private JLabel lblInfo2;
    private JButton btn1Grad;

    public void Grafica()
    {
        JFrame frameBucatarie = new JFrame("Bucatarie");
        frameBucatarie.getContentPane().add(PanelBucatarie);
        frameBucatarie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameBucatarie.pack();

        final int lungime = 600;
        final int latime = 600;

        frameBucatarie.setSize(lungime,latime);
        frameBucatarie.setVisible(true);
        lblAfisTempActuala.setText(String.valueOf(getTemperatura()));
        btn1Grad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTemperatura(0);
                lblInfo2.setText("Temperatura a fost modificata la 0 grade!");
            }
        });
        btnModificareTemperatura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setTemperatura(Double.parseDouble(lblAfisTempActuala.getText()));
                    setTemperaturaMax(Double.parseDouble(txtTempMaxima.getText()));
                    setTemperaturaMin(Double.parseDouble(txtTempMinima.getText()));
                    mentineTemperatura();
                    Graphics g = panelGrafic.getGraphics();
                    g.setColor(Color.white);
                    g.fillRect(10, 10, panelGrafic.getWidth() - 50, panelGrafic.getHeight() - 50);
                    g.drawRect(10, 10, panelGrafic.getWidth() - 50, panelGrafic.getHeight() - 50);
                    g.setColor(Color.gray);
                    for (int i = 10; i < panelGrafic.getWidth() - 40; i = i + 10) {
                        g.drawLine(i, 10, i, panelGrafic.getHeight() - 40);
                    }
                    for (int i = 10; i < panelGrafic.getHeight() - 40; i = i + 10) {
                        g.drawLine(10, i, panelGrafic.getWidth() - 40, i);
                    }
                    g.setColor(Color.red);
                    int h = (int) (((panelGrafic.getWidth() - 50) * 3) / veziEvolutie.size());
                    int x1 = 25;
                    int k = 0;
                    for (int i = 0; i < veziEvolutie.size(); i = i + 5) {
                        x1 = x1 + h;
                        g.setColor(Color.red);
                        g.fillOval(x1, panelGrafic.getHeight() - (int) ((veziEvolutie.get(i)) * 10), 6, 6);
                        k = i;

                    }
                    g.setColor(Color.blue);
                    g.drawString(String.valueOf(new DecimalFormat("##.##").format(veziEvolutie.get(k))), x1 - 10, panelGrafic.getHeight() - (int) ((veziEvolutie.get(k)) * 10) + 20);

                }
                catch (Exception  d)
                {
                    lblInfo2.setText("Incarcati date valide!");
                }
            }
        });
    }

    /**
     CONSTRUCTOR 1
     */
    public Bucatarie (double temperatura, double temperaturaMin, double temperaturaMax) {
        super(temperatura, temperaturaMin, temperaturaMax);
        this.veziEvolutie = new ArrayList<>();
        counter++;
        Grafica();

    }
    /**
     CONSTRUCTOR 2
     */
    public Bucatarie (double temperatura) {
        super(temperatura, 10, 17);
        counter++;
        Grafica();
    }

    /**
     SINGLETON CONSTRUCTOR
     */
    private Bucatarie(){
        super(-1, -1, -1);
        this.veziEvolutie = null;
    }

    /**
     METODA SINGLETON
     */
    public static Bucatarie getInstance(){
        if (null == instance){
            instance = new Bucatarie();
        }
        return instance;
    }

    /**
    REGLAREA TEMPERATURII
     */
    public void mentineTemperatura() {
        double temperatura = getTemperatura();
        double temperaturaMin = getTemperaturaMin();
        double temperaturaMax = getTemperaturaMax();
        final double modificare = 0.1;

        if ((temperaturaMax > 0) && (temperaturaMin > 0) && (temperaturaMax < 40) && (temperaturaMin < 40)){
            lblInfo2.setText("Modificarile au fost facute, noua dvs temperatura a fost setata");

            System.out.println("Temperatura medie este " + ((temperaturaMax + temperaturaMin) / 2) + ", temperatura " + temperatura + " va fi modificata pana va avea aceeasi valoare cu temperatura medie dorita.");
            if (temperatura < ((temperaturaMax + temperaturaMin) / 2)) {
                while (temperatura <= ((temperaturaMax + temperaturaMin) / 2)) {
                    double y = ((double) ((int) (temperatura * 100)) / 100.0);
                    veziEvolutie.add(y);
                    setTemperatura(temperatura + modificare);

                }
            }
            if (temperatura > (temperaturaMax + temperaturaMin) / 2) {
                while (temperatura >= (temperaturaMax + temperaturaMin) / 2) {
                    veziEvolutie.add(temperatura);
                    setTemperatura(temperatura - modificare);

                }
            }
            setTemperatura(veziEvolutie.get(veziEvolutie.size() - 1));
            lblAfisTempActuala.setText(String.valueOf(temperatura));

        }
        else lblInfo2.setText("Temperaturile nu corespund valorilor normale,introdu alte valori!");

        List<String> strings = new ArrayList<>();
        for (Double d : veziEvolutie) {
            strings.add(d.toString());
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Bucatarie.txt"));
            writer.write("Temperatura din bucatarie s-a modificat in felul urmator: "+"\n");
            writer.write(String.valueOf(strings));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void InchidereCaldura(){
        setTemperatura(0);
        System.out.println("Temperatura in" + getClass().getName() + ", a fost setata la 0 grade!");
    }

    public int getCounter(){
        return counter;
    }
}

