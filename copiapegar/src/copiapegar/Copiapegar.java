
package copiapegar;

import java.awt.FlowLayout;
import javax.swing.*;

public class Copiapegar extends JFrame{
    
    private JLabel labelPegar = new JLabel("copiado");
    private JLabel labelTitulo = new JLabel("titulo");
    private JTextField 
    private JButton 
    public Copiapegar(){
        
        setTitle("Copiar");
        setSize(350,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        
    }

    
    public static void main(String[] args) {
     
        Copiapegar ventana = new Copiapegar();
        
    }
    
}
