package EncapsulationDemo1;

public class MainSetterGetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetterGetterWithCond  acc = new SetterGetterWithCond();
		
		
		acc.setFullName("Jamie Foxx");
		acc.setAccountNumber(34435365L);
		acc.setAddress("RK Main");
		acc.setEmail("JamieFoxx.com");
		acc.setDepositAmount(500); //>100
		acc.setAccountBalance(20000);
		
		System.out.println("Full name: " + acc.getFullName());
		System.out.println("Address : " + acc.getAddress());
		System.out.println("Account number: " + acc.getAccountNumber());
		System.out.println("Email address: " + acc.getEmail());
		System.out.println("Employee Deposite : " + acc.getDepositAmount());
		System.out.println("Employee Total Account Balance: " + acc.getAccountBalance());
	}

}
