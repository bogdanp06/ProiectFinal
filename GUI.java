import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {


    private JPanel Meniu;
    private JButton bucatarieButton;
    private JButton garajButton;
    private JButton dormitorButton;
    private JLabel TempBucatarie;
    private JLabel TempDormitor;
    private JLabel TempGaraj;

    public GUI() {
        bucatarieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        dormitorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        garajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {

    JFrame GUI = new JFrame();
    GUI.setContentPane(new GUI().Meniu);
    GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GUI.pack();
    GUI.setSize(600,500);
    GUI.setVisible(true);
    GUI.setTitle("Casa");
    ImageIcon Icon = new ImageIcon("icon.png");
        GUI.setIconImage(Icon.getImage());
}
}
