package exercise4_14;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

//Exercise 4.6
/*
 * A helper class to draw the circle icon
 */
public class Circle extends JPanel {

	private Color color;
	/**
	 * A constructor of the circle with initial color Red
	 */
	public Circle()
	{
		color = Color.RED;
	}
	
	/**
	 * A method to draw the circle and paint it 
	 */
	public void paint(Graphics g) {
		
		setSize(500,500);
		g.drawOval(0, 50, 50, 50);
		g.setColor(color);
		g.fillOval(0, 50, 50, 50);
	}
	
	/**
	 * 
	 * @param c the color to set the color of the circle to
	 */
	public void setColor(Color c)
	{
		this.color = c;
	}

}
