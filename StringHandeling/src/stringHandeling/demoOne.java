package stringHandeling;

public class demoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Jamie"; //String name = name String("JAmie");
		
		System.out.println( name.concat("Foxx"));
		System.out.println("Name: " + name);
		
		String str2 = "I"  + " " +"Like" +" "+ "JAVA"  +" "+ "Language";
		//concat
		System.out.println(str2);
		
		int len = str2.length();  //length of string
		System.out.println("Length of string is : " + len);
		
		String str3 = "This is Hanis"; //0 to 0-1 index
		System.out.println(str3.charAt(3)); //uses index counting system
		            // or (str3.length()-1));
		String str4 = "Ismail";
		String str5 = "ISMAIL";
		
		if(str4.equalsIgnoreCase (str5)) { //ignores case sensitivity
			System.out.println("the two strings are Equal");
		}
		else {
			System.out.print(" the two strings are not equal");
		}
		
		String str6 ="        Today is holiday. Tomorrow is working day.";
		
		System.out.println(str6);
		System.out.println(str6.trim()); //trim
		
		int loc = str6.indexOf("holiday");
		System.out.println("Position of holiday: " + loc);
		
		String sub1 = str6.substring(9,16); //substring
		System.out.println("substring: " + sub1.toUpperCase ());
		
		String strArray[] = str6.split(" "); //String split
		
		for (String elt: strArray) {
			
			String str61 = "567g4837g3837h";
			char ch;
			for(int i = 0; i <str61.length(); i++) {
				ch = str61.charAt(i);
				if(Character.isDigit(ch)) {  //is it digit or letter
					continue;                 //isletter to check if it is letter
				}
				else {
					System.out.println("String contains NON digits");
				
				}

			//comparing 2 strings
			
			String str11= "abdul";
			String str22 = "abdul";
			
			int b1 = str11.compareTo(str22);
			
			//replace
			
			String st3 = "Hello";
			String st4 = st3.replace('1',  'w');
			
			System.out.println("\n" + st4);
			
			
			//String - immutable
			//StringBuffer- mutable
			//StringBuilder -  mutable
		
				}
			}
		}
	}
	



	



 //String is immutable and we can not edit it.