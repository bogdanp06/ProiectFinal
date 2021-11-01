import Camere.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.*;
import java.sql.*;
public class Casa {
    private JButton TempBucatarie;
    private JButton TempGaraj;
    private JButton TempDormitor;
    private JLabel LabelBucatarie;
    private JLabel LabelGaraj;
    private JLabel LabelDormitor;
    public  JPanel PanelCasa;
    public Casa()
    {
        JFrame frame = new JFrame();
        frame.getContentPane().add(PanelCasa);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,500);
        frame.setVisible(true);
        frame.setTitle("Casa");

        TempBucatarie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bucatarie bucatarie = new Bucatarie(8, 12, 16);
                LabelBucatarie.setText(bucatarie.tempActuala());
            }
        });
        TempGaraj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Garaj garaj=new Garaj(10,12,20);
                LabelGaraj.setText(String.valueOf(garaj.tempActuala()));
            }
        });

        TempDormitor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dormitor dormitor = new Dormitor(10, 20, 30);
                LabelDormitor.setText(String.valueOf(dormitor.tempActuala()));
            }
        });
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Casa c=new Casa();
    }
    }
