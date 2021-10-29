package Camere;

public class Temperatura {

    private double temperatura;
    private double temperaturaMin;
    private double temperaturaMax;

    public Temperatura(double temperatura, double temperaturaMin, double temperaturaMax) {
        this.temperatura = temperatura;
        this.temperaturaMin = temperaturaMin;
        this.temperaturaMax = temperaturaMax;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setTemperaturaMin(double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public void setTemperaturaMax(double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getTemperaturaMin() {
        return temperaturaMin;
    }

    public double getTemperaturaMax() {
        return temperaturaMax;
    }
}
