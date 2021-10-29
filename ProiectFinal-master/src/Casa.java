import Camere.*;
import java.util.*;
public class Casa {

    public static void main(String[] args){

        Garaj garaj = new Garaj(30);
        System.out.println(garaj.mentineTemperatura());
        garaj.getVeziEvolutie();

    }
}
