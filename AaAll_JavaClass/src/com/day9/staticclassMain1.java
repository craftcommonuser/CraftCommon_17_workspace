package com.day9;
class EmpClass1{
	static String city="New York";
	String name= "Mohhamed";
	int age= 40;
}

public class staticclassMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpClass1 n= new EmpClass1();
		EmpClass1.city="Chicago";
		n.name="bereket";
		System.out.println(EmpClass1.city);
		System.out.println(n.name);
	}
		

}
