import Camere.*;
import java.util.*;
public class Casa {

    public static void main(String[] args){

        Garaj garaj = new Garaj(5, 10);
        garaj.cresteTemperatura(10);
        System.out.println(garaj.getTemperatura());
    }
}
