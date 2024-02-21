package McDonaldsMenu;

import java.awt.Font;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class MyFrame extends JFrame {

	
    public MyFrame() {
        
    	
    	String[] a = {"eww"};
    	JComboBox<String> cheeseBurgerName = new JComboBox<>(a);
    	cheeseBurgerName.setEditable(false);
       
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        add(cheeseBurgerName);
        cheeseBurgerName.setBounds(200, 100, 220, 40);
        cheeseBurgerName.setFont(new Font("System", Font.PLAIN, 16));
        setLayout(null);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MyFrame();
            
        });
        
    }
}


