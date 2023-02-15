package DidThatHappen;

public class WhyIsThat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverFirstName;
		driverFirstName = "Hamish";
		String driverLastName;
		driverLastName = "Blake";
		String driverFullName = driverFirstName + " " + driverLastName;
		System.out.println(driverFullName);
		
		int stops;
		int fare;
		stops = 0;
		fare = 0;
		stops = stops + 1;
		fare = fare + 5;
		stops = stops + 1;
		fare = fare + 3;
		stops = stops + 1;
		fare = fare + 7;
		System.out.println("The bus made $"+fare+" after "+stops+" stops ");

		
		int x = 0;
		int y = 4;
		double z = 3;
		x = x +2;
		z = x + y - 7;
		y = x * 3;
		System.out.println("x = "+x);
		System.out.println("y - "+y);
		System.out.println("z = "+z);
		
		boolean isLightGreen= false ;
		boolean isLightYellow= true ;
		
		if(isLightGreen) {
			System.out.println("Drive!");
		} else if(isLightYellow) {
			System.out.println("Slow down.");
		} else {
			System.out.println("Stop.");
			
			
			
			boolean passport = false;
			boolean birthCertificate = true;
			boolean driversLicense = true;
			
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

}
