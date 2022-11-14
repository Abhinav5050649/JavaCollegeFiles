import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUITwo extends JFrame implements MouseListener
{
    JLabel lbmessage = null;

    public GUITwo(){
        lbmessage = new JLabel();
        this.setTitle("Java GUI");
        lbmessage.setBounds(20,50,100,20);  
        lbmessage.setText("Abhinav");
        add(lbmessage);
        setSize(400,400);
        addMouseListener(this);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        GUITwo g2 = new GUITwo();
    }

    public void mouseClicked(MouseEvent e) {
        lbmessage.setText("mouseCLicked");
        
    }

    public void mousePressed(MouseEvent e) {
        lbmessage.setText("mousePressed");
        
    }

    public void mouseReleased(MouseEvent e) {
        lbmessage.setText("mouseReleased");
        
    }

    public void mouseEntered(MouseEvent e) {
        lbmessage.setText("mouseEntered");
        
    }

    public void mouseExited(MouseEvent e) {
        lbmessage.setText("mouseExited");
    }
}