import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Part2 extends JFrame{

	private JTextField name;
	private JLabel greeting;
	private JPanel panel;
	
	public Part2() {
		
		// Create Frame : 
		setTitle("Greeting App ! ");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		// Create UI things : 
		JLabel label = new JLabel("Hi,Enter your name : ");
		
		name = new JTextField(15);
		
		JButton button = new JButton("Say Hello");
		
		greeting = new JLabel(" ");
		
		// Create panel: 
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.LIGHT_GRAY);
		
		// Add ActionListener to the Button : 
		button.addActionListener(e -> {
			String name1 = name.getText().trim();
			if(!name1.isEmpty()) {
				greeting.setText("Hello " + name1 + " ! ");
			}else { 
				greeting.setText("Please enter a name :( ");
			}
		});
		
		panel.add(label);
		panel.add(name);
		panel.add(button);
		panel.add(greeting);
		
		add(panel);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Part2();
	}
}
