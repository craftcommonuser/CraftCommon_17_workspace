package ExceptionHandeling;

public class tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
	     int divideByZero = 5 / 0;
	      System.out.println("Rest of code in try block");
		}
		catch (ArithmeticException ex) {
		 System.out.println("ArithmeticException => " + ex.getMessage());
		}

	}
	
}


