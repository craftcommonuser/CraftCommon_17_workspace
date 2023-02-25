package loopEx;

public class IncrmentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int grad= 91;


	if(grad>=90) {
		if(grad >=95) {
			System.out.println(" your grad is A+");
		}else {
		System.out.println(" your grad is A");
		}
	}
	else if(grad<90 && grad >=75) {
		System.out.println(" your grad is B");
	}
	else if(grad<75 && grad >=65) {
		System.out.println(" your grad is C");
	}
	else if(grad<65 && grad >=50) {
		System.out.println(" your grad is D");
	}
	else {
		System.out.println(" your grad is F");
	}

}

}
