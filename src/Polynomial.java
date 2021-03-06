
public class Polynomial {
/*
 * Galois Fields GF(2^m) are equivalent to polynomials of degree less than m and of coefficient 2.
 * Hence, the coefficients of GF(2^m) can be represented with binary numbers of m bits
 * 
 * We should be able to perform the following operations in GF(2^m):
 * 1) Modular reduction
 * 2) Addition
 * 3) Subtraction
 * 4) Inverse
 * 5) Multiplication
 * 6) Division
 */
	
	int value()
	{
		return Integer.parseInt(coeffs.getBits().toString());
	}
	
	BitString getCoeffs()
	{
		return new BitString(coeffs);
	}
	
	public String toString()
	{
		return coeffs.toString();
	}
	
	//Function add 
	Polynomial add(Polynomial poly)
	{
		BitString answer = coeffs.xor(poly.getCoeffs());
		Polynomial result = new Polynomial(answer);
		
		return result;
	}
	
	
	//Function subtract
	Polynomial subtract(Polynomial poly)
	{
		BitString answer = coeffs.xor(poly.getCoeffs());
		Polynomial result = new Polynomial(answer);
		
		return result;
	}	
	
	Polynomial inverse()
	{
		//To calculate the inverse of a polynomial we will use Eucledian algorithm
		
		Polynomial a1,a2;
		Polynomial b1,b2;
		
		Polynomial temp,coef,temp2;
		

		coeffs.trim();
		
		if (coeffs.getBits().toString().equals("0"))
		{
			return new Polynomial("0");
		}
		
		a1 = new Polynomial("00000000");
		b1 = new Polynomial("00000001");
		
		a2 = new Polynomial(primary);
		b2 = new Polynomial(coeffs);
		
		//Polynomial prime = new Polynomial(primary);
	
		
		while (b2.value() != 1) //while b2 != 1
		{
			
			//A1 = B1, A2 = B2
			
			temp2= new Polynomial(a1.coeffs);
			a1.coeffs = b1.getCoeffs();
			
			
			//B2 = A1- q*B1
			coef = a2.longDivisionBy(b2); //change value of B2
		
			
			coef = b1.multiply(coef);
			
			b1 = temp2.subtract(coef);
			
			
			temp = new Polynomial (a2.coeffs);
			
			a2.coeffs = b2.getCoeffs();
			b2.coeffs = temp.getCoeffs();
		

			b2.coeffs.trim();
			
			System.out.println("A1  " + a1 + "  A2  " + a2);
			System.out.println("B1  " + b1 + "  B2  " + b2);

		}
		
		return b1;
	}
	
	
	//Function multiply
	Polynomial multiply(Polynomial poly)
	{
		//To multiply two numbers in GF fields, we can multiply and reduce bit by bit
		//In order to do so, we need to find the remainder of x^n modulo the primary polynomial

		BitString remainder = primary.remainder(); //Remainder of x^n 
		BitString temp = poly.getCoeffs();
		
		BitString result = new BitString("0");
		
	
		
		int overflow;
		
		
		for (int i=degree-1; i>=0; i--)
		{
			temp.fill(degree);
			coeffs.fill(degree);
			//Check whether this temp should be included in the result (using xor) or not
			//(Depends on whether the bit is 1 or 0)
			if (coeffs.getBit(i) == 1)
			{
				result = result.xor(temp);
				
				
			}
			

			overflow = temp.shiftLeft();
			

			if (overflow == 1) //Overflow! need to xor with remainder
			{
				temp = temp.xor(remainder);
			}
	
	
		
		}
		
		Polynomial answer = new Polynomial(result);
		
		return answer;
	}
	

	
	//Function reduction to calculate the modular reduction of a number
	//Reduction reduces the polynomial itself and returns the quotient
	//(Long division)
	Polynomial reduce()
	{
		//We know that (a+b) mod n = (a mod n + b mod n) mod n
		//Hence, we can divide the polynomial into serevral "terms",
		//Reduce them one by one, then XOR them
		//The terms will be:
		//a0: all terms of degree less than n. Their reduction will give a0
		//ai : x^i i going from n to the degree of the polynomial.
		//Their reduction will give the terms of the irreducible polynomial with degree less than n times(x^(i-n))
		//Which is equivalent to i-n left shifts
		
	/*	BitString s = new BitString();
		BitString bits = primary.remainder();
		BitString quotient = new BitString("0");
		
		BitString x = new BitString("1");
		
		
		
		if (coeffs.getSize() <= degree)
			return new Polynomial(coeffs);
			
		for (int i = coeffs.getSize()-1; i>=0; i--)
		{
			if (i> coeffs.getSize()-degree)
			{
				s.insert( coeffs.getBit(i));
			}
			else
			{
				if (coeffs.getBit(i) == 1)
				{
					s = s.xor(bits);
					quotient = quotient.xor(x);
				}
				
				bits.shiftLeft();
				x.shiftLeft2();
			}
			
			System.out.println(quotient);
			
		}
		
		*/
		
		//coeffs = s;
		//return new Polynomial(quotient);
		
		return longDivisionBy(new Polynomial(primary));
		
		
	}
	
	Polynomial divide(Polynomial poly)
	{
		return this.multiply(poly.inverse());
	}
	
	private Polynomial longDivisionBy(Polynomial y)
	{
		//To divide two polynomials we need to use long division
		//Steps: Keep shifting y until x and y are of the same size
		//Substract the results (xor)
		//Repeat until y is bigger than x; x is the remainder
		
		//Only used in class
		
		
		BitString dividend = new BitString(coeffs);
		BitString divisor = y.getCoeffs();
		
		//Get rid of leading 0s
		dividend.trim();
		divisor.trim();
		
	
	
		BitString temp;
		BitString x;
		
		BitString result = new BitString("0");
		
		while (divisor.getSize() <= dividend.getSize())
		{
			temp = new BitString(divisor);
			x = new BitString("1");
			
			while (temp.getSize() < dividend.getSize())
			{
				temp.shiftLeft2();
				x.shiftLeft2();
			}
			
			result = result.xor(x);
			dividend = dividend.xor(temp);
			
			
			dividend.trim();
			
			
			
		}
		
		coeffs = dividend;
		return new Polynomial(result);
		
		
	}
	
	
	
	
	Polynomial(BitString bits)
	{
		coeffs = new BitString(bits);
	}
	

	
	String hexToBin(char c) {
		switch(c) {
			case '0': return "0000";
			case '1': return "0001";
			case '2': return "0010";
			case '3': return "0011";
			case '4': return "0100";
			case '5': return "0101";
			case '6': return "0110";
			case '7': return "0111";
			case '8': return "1000";
			case '9': return "1001";
			case 'A': return "1010";
			case 'B': return "1011";
			case 'C': return "1100";
			case 'D': return "1101";
			case 'E': return "1110";
			case 'F': return "1111";
			case 'a': return "1010";
			case 'b': return "1011";
			case 'c': return "1100";
			case 'd': return "1101";
			case 'e': return "1110";
			case 'f': return "1111";
			default: return "";
		}
	}
	
	boolean isWhitespace(char c) {
		return     c == ' '
				|| c == '\t'
				|| c == '\r'
				|| c == '\n';
	}
	
	boolean isAcceptableDigit(char c) {
		return c >= '0' && c <= '8';
	}
	
	Polynomial(){}
	
	
	
	Polynomial (String poly)
	{
		poly = poly.trim();
		boolean isBinary = true;
		for(int i = 0; i < poly.length(); ++i) {
			if(poly.charAt(i) != '0' && poly.charAt(i) != '1') {
				isBinary = false;
				break;
			}
		}
		
		if(isBinary) {
			System.out.println(poly);
			coeffs = new BitString(poly);
			
			reduce();
			return;
		}
		
		boolean isHex = true;
		if(poly.length() < 3) {
			isHex = false;	
		}
		
		else if(poly.charAt(0) != '0') {
			isHex = false;
		}
		
		else if(poly.charAt(1) != 'x') {
			isHex = false;
		}
		
		if(isHex) {
			String binForm = "";
			//Change hex value to binary and ignore non-hex digits
			for(int i = 2; i < poly.length(); ++i) {
				binForm = binForm + hexToBin(poly.charAt(i));
			}
			
			System.out.println(binForm);
			coeffs = new BitString(binForm);
			
			reduce();
			
			return;
		}
		
		int xiCoeff[] = new int[9];
		for(int i = 0; i < 9; ++i) {
			xiCoeff[i] = 0;
		}
		
		//states are:
		//0: expecting x
		//1: expecting ^
		//2: expecting value of power
		//3: expecting +
		int curState = 0;
		for(int i = 0; i < poly.length(); ++i) {
			if(isWhitespace(poly.charAt(i))) {
				continue;
			}
			
			if(curState == 0 && poly.charAt(i) == '1') {
				xiCoeff[0] = (xiCoeff[0] + 1) % 2;
				curState = 3;
			}
			
			if(curState == 0 && poly.charAt(i) == 'x') {
				curState = 1;
			}
			
			else if(curState == 1 && poly.charAt(i) == '^') {
				curState = 2;
			}
			
			else if(curState == 2 && isAcceptableDigit(poly.charAt(i))) {
				xiCoeff[(int)poly.charAt(i) - (int)'0'] = (xiCoeff[(int)poly.charAt(i) - (int)'0'] + 1) % 2;
				curState = 3;
			}
			
			else if (curState == 3 && poly.charAt(i) == '+') {
				curState = 0;
			}
		}
		
		String binForm = "";
		for(int i = 8; i >= 0; --i) {
			char c = (char) ((int)'0' + xiCoeff[i]);
			binForm = binForm + c;
		}
		
		System.out.println(binForm);
		coeffs = new BitString(binForm);
		
		reduce();
	
	}
	
;
	

	private
	BitString coeffs; 
	int degree = 8;
	BitString primary = new BitString("100011011");
	
}
