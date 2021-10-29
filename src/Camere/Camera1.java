package Camere;
public  class Camera1 {
    double temp_actuala;
    public Camera1(double temperatura)
    {
        this.temp_actuala=temperatura;
    }
    public Camera1()
    {
        System.out.println("Nu s-a primit nicio valoare pentru temperatura");
    }
    public double CresteTemperatura(double modif) {
        temp_actuala=temp_actuala+modif;
        return temp_actuala;
    }
    public double ScadeTemperatura(double modif)
    {
        temp_actuala=temp_actuala-modif;
        return temp_actuala;
    }
    public double getTemperatura()
    {
        return temp_actuala;
    }
}

