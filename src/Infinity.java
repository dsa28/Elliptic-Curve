import java.awt.Color;

public class Infinity extends Point {

	protected int windowWidth;
	
	public void place()
	{
		this.setBounds(windowWidth-radius, 0, radius, radius);

	}
	
	public void setWindowWidth(int x)
	{
		windowWidth = x;
		place();
	}
	public String toString()
	{
		String s = Character.toString('\u221E');
		return "(" + s + "," + s + ")";
	}
	@Override
	public boolean equals(Object o)
	{
	
		if (o instanceof Infinity)
		{
			return true;
		}
		
		return false;
	}
	
	Infinity()
	{
		super(Integer.MAX_VALUE-1,Integer.MAX_VALUE-1);
		radius = 7;
	}
}
