import Camere.*;
import java.util.*;
public class Casa {
    public static void main(String[] args){
        Camera1 camera1=new Camera1(10);
        camera1.CresteTemperatura(11);
        System.out.println(camera1.getTemperatura());
        Garaj garaj=new Garaj(10);
        garaj.CresteTemperatura(1111);
        System.out.println(garaj.getTemperatura());
    }


}
