package labEX;

public class ArrayOfWeek {

	public static void main(String[] argu) {

 String days[]= {"Monday", "Tusday", "Wednesday", "Thrusday", "Friday","Satrday","Sunday"};
 int i=0;
 for(String zx : days) {
	 System.out.printf("Element at index %d : %s%n", i, zx); //%d for hold int  and %s for string and %n for new line
	 i++;
 }
	
	}
}

