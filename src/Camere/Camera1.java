package Camere;
public  class Camera1 {

    private double temp_actuala;

    public Camera1(double temperatura) {
        this.temp_actuala = temperatura;
    }
    public Camera1() {
        System.out.println("Nu s-a primit nicio valoare pentru temperatura");
    }
    public void CresteTemperatura(double modif) {
        temp_actuala = +modif;
    }
    public void ScadeTemperatura(double modif) {
        temp_actuala -=modif;
    }
    public double getTemperatura()
    {
        return temp_actuala;
    }
}

