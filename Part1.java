import javax.swing.*;
import java.awt.Color;
import java.util.*;

public class Part1 extends JFrame{
		
		private static int clickCount = 0;
		private JLabel label;
		private JPanel panel;
		private JButton button;
		
		public Part1() {
			
			// Create a simple frame : 
			setTitle("Click button counter !");
			setSize(300,100);
			setResizable(false);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setLocationRelativeTo(null); // Place the frame in the center of the window 
		    
		    // Create things in to the frame :
		    label = new JLabel("Button clicked 0 times ! ");
		    button = new JButton("Click Me ! ");
		    
		    // Create panel with background color :
		    panel = new JPanel();
		    panel.setBackground(Color.LIGHT_GRAY);
		    
		    // Add things to the Panel : 
		    panel.add(button);
		    panel.add(label);
		    
		    //Add ActionListener to the button : 
		    button.addActionListener(e -> {
		    	clickCount++;
		    	label.setText("Button clicked " + clickCount + " times ");
		    });
		    
		    // add panel to the frame : 
		    add(panel);
		    setVisible(true);
		}
		
		public static void main(String[] args) {
			new Part1();
			
		}
	
}
