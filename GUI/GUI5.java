import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUI5 extends JFrame implements ActionListener{
    
    JLabel l1 = new JLabel("Name:");
    JTextField t1 = new JTextField();
    JLabel l2 = new JLabel("Ride-Type: ");
    String[] types = {"Honda-City", "Mini-Cab", "Swift-Dzire", "Baleno"};;
    JCheckBox c1 = new JCheckBox("Return n");
    JComboBox jc = new JComboBox();

    public GUI5()
    {
        setTitle("Fare-Calculation");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String name = t1.getText();
        String r = null;
        String rtype = types[jc.getSelectedIndex()];

        if (c1.isSelected())
        {
            r = "Return-Journey";
        }
        else{
            r = "One-Way";
        }
    }

    public static void main(String[] args)
    {
        GUI5 g5 = new GUI5();
    }
}
