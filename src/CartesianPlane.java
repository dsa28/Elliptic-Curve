
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.Scanner;


import javax.swing.JPanel;

public class CartesianPlane extends JPanel implements ActionListener{

	/**
	 * A Cartesian Plane is represented by:
	 * -x axis
	 * -y axis
	 * -scale
	 * 
	 * A Cartesian Plane needs to:
	 * -Draw itself
	 * -Zoom in/out
	 * -Move in some direction
	 * -Draw points
	 * 
	 * It is the role of the plane to worry about the location of points according to the window
	 * 
	 * 
	 */

	
//Coordinates of the origin
	private int x0; //x of the origin- or x of the y axis
	private int y0; //y of the origin- or y of the x axis

//In case we want the use to set colors
	private Color bg; //background color
	private Color xAxis; //xAxis color
	private Color yAxis; //yAxis color

	private Color infinity; //point at infinity
	
//Scale
	private int scale;
	
//Points
	private ArrayList<Point> points;
	
	private Point p;
	private ArrayList<Point> selected;
	private EllipticCurve c1;
	
	private int res;
	private boolean result;
	
	private int opMax; //Maximum number of operands for an operators
	//1 for multiplication
	//2 for addition
	//1 for selection
	
	private boolean add;
	private boolean select;
	
	private int scalar;
	
	public void setAddition()
	{
		opMax = 2;
		add = true;
		select = false;
		
		deselect();
		
	}
	
	public void setMultiplication()
	{
		opMax = 1;
		add = false;
		select  = false;
		
		deselect();
	}
	
	public void setSelect()
	{
		opMax = 1;
		add = false;
		select = true;
		
		deselect();
	}

	//Zooming in out
	private void scale(double d)
	{
		if (d*scale >= 1)
		{
			scale = (int)(scale*d);
		}
		
		pointRefresh();
	}
	
	public void setCurve(EllipticCurve c)
	{
		c1 = c;
		c1.findPoints();
		
		this.removeAll();
		points = new ArrayList<Point>();
		
		addInfinity();
		
		for (int i=0; i<c1.points.size(); i++)
		{
			addPoint(c1.points.get(i));
		}
		
		repaint();
	}
	
	public void zoomIn(int i)
	{
		scale(i);
	}
	
	public void zoomOut(int i)
	{
		
			scale(1.0/i);
		
	}
	
	
	//Move the location of the origin
	public void move(int x, int y)
	{
		x0 = x;
		y0 = y;
		
		//Delete the old plane
		pointRefresh(); //Change point coordinates then repaint
		//this.repaint();
	}

	
	public void moveLeft(int x) //move left by x pixels
	{
		move(x0+x,y0);
	}
	
	public void moveRight(int x) //move right by x pixels
	{
		move(x0-x,y0);
	}
	
	public void moveUp(int y) //move up by y pixels
	{
		move(x0,y0+y);
	}
	
	public void moveDown(int y) //move down by y pixels
	{
		move(x0,y0-y);
	}
	
	
	
	public int getOriginX()
	{
		return x0;
	}
	public int getOriginY()
	{
		return y0;
	}
	
	public void addPoint(int x, int y)
	{
		Point point = new Point(x,y);
		point.place(x0+scale*x, y0-scale*y);
		
		point.addActionListener(this);
		points.add(point);
		this.add(point);
		
	}
	
	public void addInfinity()
	{
		Infinity inf = new Infinity();
		inf.setWindowWidth(this.getWidth());


		
		inf.addActionListener(this);
		points.add(inf);
		this.add(inf);
		
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(bg);
		g.fillRect(0,0,this.getWidth(),this.getHeight());
		
		//Axis in black
		g.setColor(yAxis);
		//Draw the y axis
		g.drawLine(x0, 0, x0, this.getHeight()); 
		
		//Draw the x axis
		g.setColor(xAxis);
		g.drawLine(0, y0, this.getWidth(), y0);
		
	
		((Infinity)points.get(0)).setWindowWidth(this.getWidth());
		
		g.setColor(Point.selectedColor());
		for (int i=0;i<selected.size();i++)
		{
			Point temp = selected.get(i);
			
			if (temp instanceof Infinity)
			{
				g.drawString(temp.toString(), temp.getX()-29, temp.getY()+20);
			}
			else
			{
				g.drawString(temp.toString(), temp.getX()+5, temp.getY()-2);
			}
			
			
		}
		
		if (result)
		{
			g.setColor(Point.resultColor());
			
			Point temp = points.get(res);
			//g.drawString(temp.toString(), temp.getX(), temp.getY());
			if (temp instanceof Infinity)
			{
				g.drawString(temp.toString(), temp.getX()-29, temp.getY()+20);
			}
			else
			{
				g.drawString(temp.toString(), temp.getX()+5, temp.getY()-2);
			}
		}
	
	}
	
	
	//Change the colors of the plane
	//Then check if its a different color, redraw the plane
	//if not, all good
	public void setPlaneColor(Color bg)
	{
		Color temp = this.bg;
		this.bg = bg;
		
		refresh(this.bg,temp);
	}
	
	public void setxAxisColor(Color x)
	{
		Color temp = xAxis;
		xAxis = x;
		
		refresh(xAxis,temp);
	}
	
	public void setyAxisColor(Color y)
	{
		Color temp = yAxis;
		yAxis = y;
		
		refresh(yAxis,temp);
	}
	
	public void setPointColor(Color point)
	{
		Point.setColor(point);
	}
	
	public void setInfinity(Color infinity)
	{
		Color temp = this.infinity;
		this.infinity = infinity;
		
		refresh(this.infinity,temp);
	}
	public void setScalar(int s)
	{
		scalar = s;
	}
	
	public void setScalar (String s)
	{
		 try {
		      int x= Integer.parseInt(s);
		      setScalar(x);
		      
		      if (!add && !select && selected.size()>0) //multiply
		      {	points.get(res).result = false;
		      	res= points.indexOf(c1.multiply(selected.get(0), x));
		      	points.get(res).result = true;
		      	
		      	repaint();
		      }
		      
		      //deselect();
		    }
		    catch (NumberFormatException e) {
		        //no change in the value         
		    }
		 
		 
	}
	
	public void addPoint(Point point) {
		
		addPoint(point.getXValue(), point.getYValue());
	}


	private void deselect()
	{
		if (result) //Clear result if any
		{
			points.get(res).result = false;
			result = false;
		}
		
		//Only want to select 2 points
		for (int i=0; i< selected.size() ;i++)
		{
			selected.get(i).selected = false;
			
		}
		
		selected = new ArrayList<Point>();
		
		repaint();
	}
	
	
	
	//If we changed a color, redraw the plane with a new color
	public void refresh(Color x, Color y) 
	{
		if (!x.equals(y))
		{
			
			this.repaint();
		}
		
		
	}
	
	private void pointRefresh()
	{
		Point temp;
		for (int i=0; i < points.size(); i++)
		{
			temp = points.get(i);
			if (points.get(i) instanceof Infinity)
			{
				((Infinity)temp).place();
			}
			else
			{
				temp.place(x0+scale*temp.getXValue(), y0-scale*temp.getYValue());
			}
		}
		
		repaint();
	}
	
	CartesianPlane(int width, int height)
	{
		
		x0 = width/4;
		y0 = 3*height/4;
		
		bg = Color.white;
		xAxis = Color.BLACK;
		yAxis = Color.BLACK;
		
		infinity = Color.pink;
		
		scale = 10;
		this.setLayout(null);
		
		points = new ArrayList<Point>();
		selected = new ArrayList<Point>();
		
		result = false;
		scalar = 1;
		
		setSelect();
	
	}


	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		p = (Point)e.getSource();
		p.setSelected(!p.isSelected());
		
		
		
		
		if (p.selected)
		{
			
		
			
			if (selected.size() < opMax)
			{
				selected.add(p);
			}
			else
			{
				
				deselect();
				selected.add(p);
			}
			
			//now that we selected the number of points needed to peform an operation,
			//we need to perform that operation
			if (selected.size() == opMax && !select) //either addition or multiplication
			{
				Point p1 = selected.get(0);
		
				
				if (add)
				{
					Point p2 = selected.get(1);
					
				
					res = points.indexOf(c1.add(p1, p2)); //Elliptic curve is closed under addition
					
					points.get(res).setResult();
					result = true;
				}
				else 
				{
					//Scanner s = new Scanner(System.in);
					//scalar = s.nextInt();

					res = points.indexOf(c1.multiply(p1, scalar)); //Elliptic curve is closed under addition
					
					points.get(res).setResult();
					result = true;
				}
				
				points.get(res).setResult();
				result = true;	
				
				
			}
		}
		else
		{
			deselect();
		}
	
		
		repaint();
		
	}

}
