package Camere;

import java.util.ArrayList;

public class Bucatarie extends Temperatura{

    public ArrayList<Double> veziEvolutie;

    public Bucatarie (double temperatura, double temperaturaMin, double temperaturaMax) {
        super(temperatura, temperaturaMin, temperaturaMax);
        this.veziEvolutie = new ArrayList<>();
    }

    public Bucatarie (double temperatura) {
        super(temperatura, 10, 17);

    }

    public void mentineTemperatura() {
        double temperatura=getTemperatura();
        double temperaturaMin = getTemperaturaMin();
        double temperaturaMax = getTemperaturaMax();
        System.out.println("Temperatura medie este "+(temperaturaMax+temperaturaMin)/2+",temperatura "+temperatura+" va fi modificata pana va avea aceeasi valoare cu temperatura medie dorita");
        if(temperatura<(temperaturaMax+temperaturaMin)/2) {
            while (getTemperatura() <= (temperaturaMax+temperaturaMin)/2) {
                veziEvolutie.add(getTemperatura());
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
}

