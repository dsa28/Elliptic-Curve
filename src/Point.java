import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class Point extends JButton {

/**
 * 2D point
 * 
 * A point is represented by:
 * -it's coordinates (x,y)
 * -it's name
 * 
 * A point needs to do the following:
 * -Return its coordinates(x or y) (useful for both calculation and drawing in a Cartesian plane)
 * -Add to another point  
 * 
 * 
 */
	

	
	//Coordinates
	protected int xCoordinate; //x coordinate
	protected int yCoordinate; //y coordinate
	
	protected static Color color;
	protected static Color selectedColor;
	protected static Color resultColor;
	
	protected int radius;
	
	String name;
	
	boolean selected;
	boolean result;
	
	public static void setColor(Color point)
	{
		color = point;
	}
	
	public static Color selectedColor()
	{
		return selectedColor;
	}
	
	public static Color resultColor()
	{
		return resultColor;
	}
	
	public String toString()
	{
		return "(" + xCoordinate + "," + yCoordinate + ")";
	}
	public void paintComponent(Graphics g)
	{
		if (result)
		{
			g.setColor(resultColor);
		}
		else if (selected)
		{
			g.setColor(selectedColor);
		}
		else
		{
			g.setColor(color);
		}
	
		
	    g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
	

	public int getXValue()
	{
		return xCoordinate;
	}
	
	public int getYValue()
	{
		return yCoordinate;
	}
	
	public void place(int x, int y)
	{
		this.setBounds(x-radius/2, y-radius/2, radius, radius);

	}

	public void setResult()
	{
		result = true;
	}
	
	public boolean isSelected()
	{
		return selected;
	}

	
	public void setSelected(boolean bool)
	{
		selected  = bool;
	}
	
	public boolean equals(Object o)
	{
		if (!(o instanceof Point))
		{
			return false;
		}
		
		Point p = (Point)o;
		
		return (xCoordinate==p.xCoordinate && yCoordinate == p.yCoordinate);
		
	}
	
	//Constructors
	Point()
	{
		//By default, a point is placed at the origin
		this(0,0);
	}
	
	Point(int x, int y)
	{
		
		//Save the point's coordinates
		xCoordinate = x;
		yCoordinate = y;
		
		radius = 10;
		color = new Color(210,210,250);
		selectedColor = new Color(238,130,238);
		resultColor = new Color(148,0,211);
		
		selected = false;
		result = false;
		
		//this.addMouseListener(this);
		
	}
	
	 Point (int x, int y, String name)
	{
		this(x,y);
		this.name = name;
	}

	


	
	
	
}
