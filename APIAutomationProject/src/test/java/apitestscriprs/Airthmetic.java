package apitestscriprs;
public class Airthmetic {
	
	public int sum (int a, int b) {
		int c	;
		c= a+b;
		System.out.println("The sum of two number is " + c);
	    return c;
	}
	
	public int sub (int x, int y) {
		int z	;
		z= x - y;
		System.out.println("The subtraction of two number is " + z);
	    return z;
	}
	
	public int multiply(int a1, int a2) {
		int a3 ;
		a3 = a1 * a2;
		System.out.println("The multiplication of two number is " + a3);
		return a3
;	}
	
	public static void main(String[] args) {
		Airthmetic Airth1 = new Airthmetic();
		int sum1= Airth1.sum(10, 12);
		int sub2 = Airth1.sub(20,15);
		Airth1.multiply(10, 20);
		System.out.println("The final result is :" + Airth1.multiply(Airth1.sub(Airth1.sum((Airth1.sum(10, 2)),2),2),2));
		//		System.out.println("The final result is :" + Airth1.multiply(Airth1.sub(Airth1.sum(Airth1.sum(10, 2)),2),2),2)));	
	}
	

}
