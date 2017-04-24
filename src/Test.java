
public class Test {

	public static void main(String[] args)
	{
		Window window = new Window();
		window.setVisible(false);
		
		EllipticCurve c1;
		
		c1 = new EllipticCurve(5); //primes from 1 to 499
		c1.setA(4);
		c1.setB(4);
		c1.findPoints();
		
		
		//Point p1= new Point(1,2);
		Point p2 = new Point(1,3);
		
		//System.out.println(c1.add(p1, p1));
		window.p.setCurve(c1);
		
		//System.out.println(c1.multiply(p1,4));
		/*for (int i=0; i<c1.points.size(); i++)
		{
			window.put(c1.points.get(i));
		}*/
		


		window.setVisible(true);
		while (true)
		{
			
		}
		
		
	}
	
	
}
