package craftday8;

public class Switchdemo {

	public enum vowel {a,e,i,o,u
		
	}
	public static void main(String[] args) {
		
		// TODO Auto generated method stub
		
vowel[] character= vowel.values(); 

for (vowel now : character) {
switch (now) {

case a:
	
	System.out.println(" ' a' is a vowel");
	
	break;
	
case e:
	
	System.out.println(" ' e' is a vowel ");
	
	break;
	
case i:
	
	System.out.println(" 'i' is a vowel");
	
	break;
	
case o:
	
	System.out.println(" 'o' is a vowel");
	
	break;
	
case u:
	
	System.out.println(" 'u' is a vowel");
	
	break;
	                  default:
	    System.out.println("it is a consonant");            	           
	
}
}
	}

}
