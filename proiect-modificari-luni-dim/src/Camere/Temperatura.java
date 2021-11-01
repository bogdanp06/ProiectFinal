package Camere;

public class Temperatura {
    private double temperatura;
    private double temperaturaMin;
    private double temperaturaMax;

    public Temperatura(double temperatura, double temperaturaMin, double temperaturaMax) {
        setTemperatura(temperatura);
        setTemperaturaMin(temperaturaMin);
        setTemperaturaMax(temperaturaMax);
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
    public String toString()
    {
        StringBuffer sb=new StringBuffer("Temperaturile sunt urmatoarele: ");
        sb.append("Temperatura din " + getClass().getName() + " este "+getTemperatura()+"\n");
        sb.append("Temperatura maxima este "+getTemperaturaMax()+"\n");
        sb.append("Temperatura minima este "+getTemperaturaMin()+"\n");
        return sb.toString();
    }

}
