package Polymorphism;

public class account {

	private String accountName;  // this is constructor
	private Long accountNumber;
	private double accountDeposit; // 1000
	private double accountBalance; // 2000
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountDeposit() {
		return accountDeposit;
	}
	public void setAccountDeposit(double accountDeposit) {
		
		if(accountDeposit>100) {
			this.accountDeposit = accountDeposit;
			}else
				System.out.println("The deposit should be greater than 100$");
		
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

}
