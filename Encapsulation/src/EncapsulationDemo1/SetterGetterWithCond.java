package EncapsulationDemo1;

public class SetterGetterWithCond {
	
	private String fullName;
	private long accountNumber;
	private String address;
	private String email;
	private double depositAmount;
	private double accountBalance;
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		}
	
	public double getDepositAmount() {
		return depositAmount;
	
	}
	public void setDepositAmount(double depositAmount) {
		if(depositAmount >100) {
		this.depositAmount = depositAmount;
	}
		else
		System.err.println("the amount should be greater than $100");
	}
	public double getAccountBalance() {
		return accountBalance + depositAmount;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

}
