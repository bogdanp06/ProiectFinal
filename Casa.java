import Camere.*;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.*;
import java.sql.*;
public class Casa {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Bucatarie bucatarie = new Bucatarie(10, 12, 16);
        Dormitor dormitor = new Dormitor(10, 20, 30);
        Garaj garaj=new Garaj(10,12,20);
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:C:/Users/Pirlea/Desktop/ProiectFinalFinal/Temperatura.db";

        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();
        statement.execute("INSERT INTO Bucatarie(temperatura, temperaturaMin, temperaturaMax) values(" + bucatarie.getTemperatura() + "," + bucatarie.getTemperaturaMin() + "," + bucatarie.getTemperaturaMax()+")");
        statement.execute("INSERT INTO Garaj(temperatura, temperaturaMin, temperaturaMax) values(" + garaj.getTemperatura() + "," + garaj.getTemperaturaMin() + "," + garaj.getTemperaturaMax()+")");
        statement.execute("INSERT INTO Dormitor(temperatura, temperaturaMin, temperaturaMax) values(" + dormitor.getTemperatura() + "," + dormitor.getTemperaturaMin() + "," + dormitor.getTemperaturaMax()+")");
    }
    }
