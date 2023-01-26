package day3;
import java.util.Scanner;
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner input = new Scanner(System.in); 
    System.out.println("pls enter ur name:");
    String empname = input.next();
    System.out.println("pls enter ur age:");
    int empage = input.nextInt ();
    System.out.println("pls enter ur salary:");
    Double empsalary = input.nextDouble ();
    System.out.println("pls enter ur bonus:");
    Double empbonus = input.nextDouble ();
    Double Totalsalary = empsalary + empbonus;
    
    		
    System.out.println("employee name:" + " " + empname);
    System.out.println("employee age:" + " " + empage);
    System.out.println("employee salary:" + " " + empsalary);
    System.out.println("employee bonus:" + " " + empbonus);
    System.out.println("employee total salary:" + " " + Totalsalary);
	}

}
