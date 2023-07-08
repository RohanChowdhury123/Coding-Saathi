package com.rohan_javaInternshipTasks;
import java.util.Scanner;
class ATM{
	float Balance;
	private int PIN=2024;
	Scanner sc= new Scanner(System.in);
	public void checkPin() {
		System.out.println("Enter Your PIN :");
		int pin=sc.nextInt();
		if(pin==PIN) {
			showMenu();
		}
		else {
			System.out.println("PLEASE ENTER A VALID PIN !!!");
			checkPin();
		}
	}
		public void showMenu(){
			System.out.println("Enter 1 For Checking Balance");
			System.out.println("Enter 2 To Withdraw Money");
			System.out.println("Enter 3 To Deposit Money");
			System.out.println("Enter 4 For Exit");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
			System.out.println("ENTER YOUR CHOICE: ");
			int option=sc.nextInt();
				if (option==1) {
					checkBalance();
			    }
				else if (option==2) {
					getWithdraw();
				}
				else if (option==3) {
					getDeposit();
				}
				else if (option==4) {
					System.out.println("  YOU HAVE SUCCESSFULLY EXITED FROM THE ATM INTERFACE\n	||||| THANK YOU AND VISIT AGAIN |||||");
					return;
				}
			}
		public void checkBalance() {
			System.out.println("YOUR CURRENT BALANCE IS :"+ Balance+"\n");
			showMenu();
		}
		public void getWithdraw() {
			System.out.println("ENTER AMOUNT TO BE WITHDRAWN :");
			float withdrawAmount=sc.nextFloat();
			if (withdrawAmount>Balance) {
				System.out.println("INSUFFICIENT BALANCE");
				showMenu();
			}
			else {
				Balance-=withdrawAmount;
				System.out.println("AMOUNT WORTH "+ withdrawAmount+" IS SUCCESSFULLY WITHDRAWN.\n");
				showMenu();
			}
		}
		public void getDeposit() {
			System.out.println("ENTER AMOUNT TO BE DEPOSITED :");
			float depositAmount=sc.nextFloat();
			Balance+=depositAmount;
			System.out.println("AMOUNT WORTH "+ depositAmount+" IS SUCCESSFULLY DEPOSITED.\n");
			showMenu();
		}	
}

public class AtmInterface {
	public static void main(String[] args) {
		ATM newCustomer = new ATM();
		newCustomer.checkPin();
	}

}
