package exercise4_14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Exercise 4.14
public class ButtonTester {

	static Circle c = new Circle();
	static JFrame frame = new JFrame();
	public static void main(String[] args) {
		
		frame.setSize(250, 300);
		JButton redButton = new JButton("Red");
		JButton greenButton = new JButton("Green");
		JButton blueButton = new JButton("Blue");		
		JLabel circleLabel = new JLabel();
		redButton.addActionListener(changeColor());
		greenButton.addActionListener(changeColor());
		blueButton.addActionListener(changeColor());
		frame.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		frame.add(redButton, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		frame.add(greenButton, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		frame.add(blueButton, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		frame.add(c, gbc);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.pack();
		frame.setVisible(true);
	}

	public static ActionListener changeColor() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if (event.getActionCommand().equals("Green")) {
					c.setColor(Color.GREEN);
				} else if (event.getActionCommand().equals("Red")) {
					c.setColor(Color.RED);
				} else if (event.getActionCommand().equals("Blue")) {
					c.setColor(Color.BLUE);
				}			
			
				frame.repaint();
			}
		};
	}
}
