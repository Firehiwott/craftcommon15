package Polymorphism;

public class account2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account acc = new account();

		acc.setAccountName("Fre");
		acc.setAccountDeposit(500);
		acc.setAccountBalance(1000);
		acc.setAccountNumber(1234455L);
		
		
		
		
		System.out.println("account owner name:" + acc.getAccountName());
		System.out.println("account  Balance:" + acc.getAccountBalance());
		System.out.println("account deposit :" + acc.getAccountDeposit());
		System.out.println("account number:" + acc.getAccountNumber());
		

	}

}
