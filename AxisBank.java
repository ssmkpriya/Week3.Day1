package week3.day1;

public class AxisBank extends BankInfo {
	
	public void bankName() {
		System.out.println("Axis Bank");

		
	}
	public void deposit() {
		System.out.println("overriding in deposit method");
		
	}
	public static void main(String[] args) {
		
		AxisBank axis=new AxisBank();
		axis.bankName();
		axis.saving();
		axis.fixed();
		axis.deposit();
	}

}
