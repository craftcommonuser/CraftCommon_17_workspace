package exception;

public class Exceptiin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5, b= 0;
		
		try {
			String name = null;
			System.out.println(name.length());
			int[] arr = new int [5];
			arr [5] = 19;
		System.out.println(a/b);
		}catch (ArithmeticException e) {
			System.out.println("Error happened: " + e.getMessage());
			
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Error happened: " + ex.getMessage());
			
		}catch (NullPointerException x) {
				System.out.println("Error happened: " + x.getMessage());
			}
		
	


}
	
}





			
		
	

	
				
			

	


		
				
						
