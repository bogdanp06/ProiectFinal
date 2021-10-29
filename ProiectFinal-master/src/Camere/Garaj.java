package Camere;

import java.util.ArrayList;
import java.util.List;

public class Garaj extends Temperatura {

    private double termperaturaMedie;

    public Garaj(double temperatura, double temperaturaMin, double temperaturaMax, double termperaturaMedie) {
        super(temperatura, temperaturaMin, temperaturaMax);
        this.termperaturaMedie = termperaturaMedie;
    }

    public Garaj(double temperatura, double termperaturaMedie) {
        super(temperatura, 10, 17);
        this.termperaturaMedie = termperaturaMedie;
    }


    public double cresteTemperatura(double temp) {
        double temperatura = getTemperatura();
        return (temperatura += temp);
    }

    public double scadeTemperatura(double temp) {
        double temperatura = getTemperatura();
        return (temperatura -= temp);
    }

    public double mentineTemperatura(double temp) {
        double temperatura = getTemperatura();
        double temperaturaMin = getTemperaturaMin();
        double temperaturaMax = getTemperaturaMax();

        List<Double> mediaZilei = new ArrayList<>();
        mediaZilei.add(temperatura);

        if (temperatura < temperaturaMin) {
            while (temperatura <= temperaturaMax) {
                temperatura += 0.1;
            }
            return temperatura;
        }
        if (temperatura > temperaturaMax) {
            while (temperatura >= temperaturaMin) {
                temperatura -= 0.1;
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
}
