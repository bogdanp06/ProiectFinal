package Camere;
import java.util.List;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Dormitor extends Temperatura implements InchCaldura {
    public List<Double> veziEvolutie;

    public Dormitor(double temperatura, double temperaturaMin, double temperaturaMax) {
        super(temperatura, temperaturaMin, temperaturaMax);
        veziEvolutie = new ArrayList<>();
    }

    public Dormitor(double temperatura) {
        super(temperatura, 10, 17);
        veziEvolutie = new ArrayList<>();
    }
    public void mentineTemperatura() {
        double temperatura=getTemperatura();
        double temperaturaMin = getTemperaturaMin();
        double temperaturaMax = getTemperaturaMax();
        System.out.println("Temperatura medie este "+(temperaturaMax+temperaturaMin)/2+",temperatura "+temperatura+" va fi modificata pana va avea aceeasi valoare cu temperatura medie dorita");
        if(temperatura<(temperaturaMax+temperaturaMin)/2) {
            while (getTemperatura() <= (temperaturaMax+temperaturaMin)/2) {
                double y = (double)((int)(getTemperatura() * 100))/100.0;
                veziEvolutie.add(y);
                setTemperatura(getTemperatura() + 0.1);

            }
        }
        if(temperatura>(temperaturaMax+temperaturaMin)/2) {
            while (getTemperatura() >= (temperaturaMax + temperaturaMin) / 2) {
                veziEvolutie.add(getTemperatura());
                setTemperatura(getTemperatura() - 0.1);

            }
        }
    }
    public void getEvolutie() {
        for (int i = 0; i < veziEvolutie.size(); i++) {
            System.out.println(veziEvolutie.get(i));
        }
    }
    public void InchidereCaldura(){
        setTemperatura(0);
        System.out.println("Temperatura in Dormitor a fost setata la 0 grade!");
    }
}

