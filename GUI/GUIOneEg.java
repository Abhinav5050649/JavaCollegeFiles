import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIOneEg extends JFrame implements WindowListener{

    JLabel lblMessage = null;

    public GUIOneEg()
    {
        lblMessage = new JLabel("Message");
        this.setTitle("Welcome to Jave-GUI!!!");
        
        add(lblMessage);
        lblMessage.setText("Hello from Swing!");
        setSize(400, 400);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        lblMessage.setText("windowOpened");
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        lblMessage.setText("windowClosing");
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        lblMessage.setText("windowClosed");
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
        lblMessage.setText("windowactivate");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        lblMessage.setText("windowdeactivated");
        
    }
    public static void main(String[] args)
    {
        GUIOneEg g1 = new GUIOneEg();
    }
}