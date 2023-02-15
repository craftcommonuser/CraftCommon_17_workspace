package IfInfo;

public class Ifproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean passport = false;
		boolean birthCertificate = true;
		boolean driversLicense = false;
		
		if (passport) {
			System.out.println("A passport is a valid ID.");
		} else if (birthCertificate) {
			System.out.println("A birth certificate is valid ID.");
		} else if (driversLicense) {
			System.out.println("A driver's license is a valid ID.");
		} else {
			System.out.println("Invalid ID. Your application is denied.");
		}
		
	
		
	}
}

	


