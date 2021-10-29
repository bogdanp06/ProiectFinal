package Camere;
public class Garaj extends Temperatura{

    private double termperaturaMedie;

    public Garaj(double temperatura, double temperaturaMin, double temperaturaMax, double termperaturaMedie) {
        super(temperatura, temperaturaMin, temperaturaMax);
        this.termperaturaMedie = termperaturaMedie;
    }

    public Garaj(double temperatura, double termperaturaMedie) {
        super(temperatura, 10, 17);
        this.termperaturaMedie = termperaturaMedie;
    }

//    public double getTermperaturaMedie() {
//        return termperaturaMedie;
//    }

    public void cresteTemperatura(double temp){

//        return

    }
}
