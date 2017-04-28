import java.util.ArrayList;

public class EllipticCurve {

	private int p; //prime p
	private int a;
	private int b;
	
	ArrayList<Point> points; //points in the curve
	
	
	private int squareRoot(int y)
	{
		//Function to find out if a number has a square root (modulo a number)
		//will do so by trial and error- can optimize with Tonelli Shanks
		for (int i=0; i < p; i++){
			
			int y2 = mod(i*i); //i^2 mod p
			if (y2 == y) //okk found the square root!
			{
				return i;
			}
			
		}
		
		return -1; //oh no :( no square root
		
	}
	private int mod(int x)
	{
		return mod(x,p);
	}
	
	private int mod(int x,int y) //helper function to get modulo
	//Deals with negative numbers
	{
		int mod = x%y;
		while (mod<0)
		{
			mod += y;
		}
		
		return mod;
	}
	
	private int inverse(int x) //helper function to find inverse of x mod p
	{
		int a1=p;
		int b1=x;
		
		int a2=0;
		int b2=1;
		
		int r; 
		int temp;
		int temp2;
		
		
		while (b1 != 1) //always get 1; all numbers have inverse because p is prime
		{
			
			r = a1/b1;
			
			temp = b1;
			temp2 = b2;
			
			b1 = a1-r*b1;
			b2 = a2-r*b2;
			
			a1 = temp;
			a2 = temp2;
			
			
		}
		
		return mod(b2);
	}
	
	public void findPoints()
	{
		int y2;
		int y;
		
		//points.add(new Infinity());
		
		for (int x=0; x<p; x++) //all numbers from 0 to p
		{
			y2 = mod(x*x*x + a*x + b); //y^2 = x^3 + ax + b mod p
			
			y = squareRoot(y2);
			
			if (y != -1) //check if y is an integer or not
			{
				//if y is really an integer, we found 2 points :)
				points.add(new Point(x,y));
				
				if (y!=0)
				{
					points.add(new Point(x,p-y)); 
				}
			}
				
		}
		
	}
	
	public void printPoints()
	{
		for (int i=0; i<points.size(); i++)
		{
			System.out.println(points.get(i));
		}
	}
	public void setA(int a)
	{
			this.a = a;
			points = new ArrayList<Point>();
			findPoints();
		
	}
	

	public void setB(int b)
	{
			this.b = b;
			points = new ArrayList<Point>();
			findPoints();
	}
	
	public void setP(int p)
	{
		this.p = p;
		points = new ArrayList<Point>();
		findPoints();
	}
	
	public Point add(Point p1, Point p2)
	{
		int y1 = p1.getYValue();
		int x1 = p1.getXValue();
		
		int y2 = p2.getYValue();
		int x2 = p2.getXValue();
		
		int x3;
		int y3;
		
		int m;
		
	
		if (p1 instanceof Infinity)
		{
			return p2;
		}
		if (p2 instanceof Infinity)
		{
			return p1;
		}
		
		if (!p1.equals(p2))
		{
			if (x1 == x2)//get 0
			{
				
				return new Infinity(); 
			}
			
			int temp = mod(x2-x1); 
			System.out.println(temp);
			m= mod((y2-y1)*inverse(temp)); //want inverse of a number modulo a prime
		}
		else
		{
			if (y1 == 0)
			{
				return new Infinity();
			}
			
			int temp = mod(2*y1);
			m = mod((3*x1*x1 + a)*inverse(temp)); 
		}
		
		x3 = mod(m*m -x1 - x2);
		y3 = mod(m*(x1-x3) - y1);
		
		Point p3 = new Point(x3,y3);
		return p3;
	}
	
	
	public Point multiply(Point p, int x)
	{
		
		if (x == 0)
		{
			return new Infinity();
		}
		if (x==1)
		{
			return p;
		}
		
		Point p2 = add(p,p);
		if (x == 2)
		{
			return p2;
		}
		
		if (x%2 == 0 )
		{
			return multiply(p2,x/2);
		}
		
		return add(p,multiply(p2,(x-1)/2));
		
	}
	
	EllipticCurve(int p)
	{
		this.p = p;
		a = 0;
		b = 0;
		
		points = new ArrayList<Point>();
	}
}
