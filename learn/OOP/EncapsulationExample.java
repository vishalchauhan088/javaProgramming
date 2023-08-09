class BankAccount{
	private double balance;
	
	public void deposit(double t){
		balance += t;
	}
	public double getBalance(){
		return balance;
	}
}

public class EncapsulationExample{
	public static void main(String[] args){
		BankAccount a1 = new BankAccount();
		a1.deposit(5000);
		System.out.println("Balance is: " + a1.getBalance());
	}
}