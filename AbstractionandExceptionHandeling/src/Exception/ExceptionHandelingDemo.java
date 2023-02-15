package Exception;

public class ExceptionHandelingDemo {

	public static void main(String[] args) { //throw
		// TODO Auto-generated method stub
		
		try { //address the error
			int age = 16;
			validate(age); //validate concept
			
			String name = null;
			name.length();
			int[] arr = new int[5];//  length = 5, 0-4
			arr [5] = 10;
			int a = 20/0;
		}
		catch(ArithmeticException ex) {
			System.out.println("arthmetic exception handled");
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
		// finally {
		// System.out.println("After exception in the finally block");
		
		}
		catch(NullPointerException ex) {
			System.out.println("disregarded");
		}
//to take care of every exception all at once use catch(exception e) {
	}

	public static void validate(int age) { //validate concept 
		// TODO Auto-generated method stub
		
		if (age <18) {
			throw new ArithmeticException("not valid");
		}
		
		
		
	}
}


//finally it is used to execute necessary code regardless of the error
//throw it throws the exception explicitly 
//throws