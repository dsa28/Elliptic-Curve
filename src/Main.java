import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Main {

	public static void main (String[] args)
	{
		
	
		/*
		 * 
		Polynomial y = new Polynomial("01101100");
		Polynomial x = new Polynomial("00111011");
		
	//	System.out.println(x);
	
		//y = new Polynomial("11101");
		x = new Polynomial("11101");
		
		Polynomial s;
		//s = x.multiply(x);
		//s = y.divideBy(x);
		
		//System.out.println(y);
		//System.out.println(x);
		//System.out.println(s);
		
		s = y.inverse();
		
		System.out.println(s);
		*/
		
		Polynomial y = new Polynomial("10001111");
		Polynomial x = new Polynomial("01001010");
		Polynomial d =  new Polynomial("11");
		System.out.println(d);
		
		Polynomial s = y.multiply(x);
		
		System.out.println(s.add(d));
		
		Polynomial z= new Polynomial("01110110");
		//z = z.inverse();
		
		//System.out.println(z);
	}
}
