import Camere.*;
import java.util.Random;
import java.util.*;
public class Casa {

    public static void main(String[] args){
        Random rand=new Random();
        Garaj garaj = new Garaj(14,20,40);
        Bucatarie bucatarie=new Bucatarie(10,20,30);
        System.out.println("Temperatura in camera este "+garaj.getTemperatura());
        garaj.mentineTemperatura();
        garaj.getEvolutie();
        bucatarie.mentineTemperatura();
        System.out.println(bucatarie.toString());
    }
}
