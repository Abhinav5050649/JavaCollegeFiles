import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUIThree extends JFrame implements ActionListener{

    JLabel lbmessage = null;
    JButton btnButton;
    public GUIThree()
    {
        lbmessage = new JLabel("TEXT");
        btnButton = new JButton("CLICK");

        lbmessage.setBounds(50, 100, 100, 20);
        add(lbmessage);

        btnButton.setBounds(50, 70, 50, 20);
        add(btnButton);

        this.setTitle("Java GUI");
    }

    public static void main(String[] args)
    {
        
    }
}