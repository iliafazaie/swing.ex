import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Part3 extends JFrame{
	
	private JComboBox<String> colorComboBox;
	
	public Part3() {
		
		setTitle("Theme Color Selector !");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// Color : 
		String[] colors = {"Red","Green","Blue"};
		colorComboBox = new JComboBox<>(colors);
		
		//Listeners for color selection : 
		colorComboBox.addActionListener(e -> {
			String selected = (String) colorComboBox.getSelectedItem();
			
			switch(selected) {
			case "Red" : 
				getContentPane().setBackground(Color.RED);
				break;
			case "Green" : 
				getContentPane().setBackground(Color.green);
				break;
			case "Blue" : 
				getContentPane().setBackground(Color.blue);
				break;
			}
		});
		
		// setLayout and add ComboBox : 
		setLayout(new FlowLayout());
		add(new JLabel("Select a theme color : "));
		add(colorComboBox);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Part3();
	}

}
