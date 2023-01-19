package com.icraftjava;

public class SwitchName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int name =4;
		String Sname;
		String Lname;
		switch(name) {
		case 1:
			Sname= "Bereket";
			Lname= "Bereket";
			break;
		case 2:
			Sname= "elias";
			Lname= "Bereket";
			break;
		case 3:
			Sname= "Buruk";
			Lname= "Bereket";
			break;
		case 4:
			Sname= "petros";
			Lname= "Bereket";
			break;
		default:
			Sname= "no student";
			Lname= "Bereket";
			break;
		}
		System.out.println(Sname + " " + Lname);

	}

}
