package Camere;

import java.util.ArrayList;
import java.util.List;

public class Garaj extends Temperatura {


    private List<Double> veziEvolutie;

    public Garaj (double temperatura, double temperaturaMin, double temperaturaMax) {
        super(temperatura, temperaturaMin, temperaturaMax);
        this.veziEvolutie = new ArrayList<>();
    }

    public Garaj (double temperatura) {
        super(temperatura, 10, 17);

    }


    public double cresteTemperatura(double temp) {
        double temperatura = getTemperatura();
        return (temperatura += temp);
    }

    public double scadeTemperatura(double temp) {
        double temperatura = getTemperatura();
        return (temperatura -= temp);
    }

    public double mentineTemperatura() {
        double temperatura = getTemperatura();
        double temperaturaMin = getTemperaturaMin();
        double temperaturaMax = getTemperaturaMax();

        if (temperatura <= temperaturaMin) {
            while (temperatura <= temperaturaMax -3) {
                temperatura += 0.1;
                veziEvolutie.add(temperatura);
            }
            return temperatura;
        }
        if (temperatura >= temperaturaMax) {
            while (temperatura >= temperaturaMax -3) {
                temperatura -= 0.1;
                veziEvolutie.add(temperatura);
            }
            return temperatura;
        }
        return temperatura;
    }

    public double getTemperaturaMedia(){
        double temperaturaMin = getTemperaturaMin();
        double temperaturaMax = getTemperaturaMax();

        return (temperaturaMax + temperaturaMin) / 2;
    }

    public List<Double> getVeziEvolutie() {
        return veziEvolutie;
    }
}
