package bank;

public class account {

	private int number;
	private String holder;
	private boolean ID;
	private double in_deposit;
	private double withdraw;	
	private double balance;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getIn_deposit() {
		return in_deposit;
	}
	public double withdraw() {
		return withdraw;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "account [in_deposit=" + in_deposit + ", number=" + number + ", holder=" + holder + ", balance="
				+ balance + "]";
	}
	public void deposit() {
		this.balance = balance += in_deposit;
	}
	
	
	
}
