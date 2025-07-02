package in.ineuron;

import java.util.Scanner;

public class BankApp 
{
	public static void main(String[] args)  {
		
		long balance =100000;
		long withdrawAmount;
		long deposite;
		int option;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Choose your option 1 for Balance Enquiry, 2 for Withdraw, 3 for Deposite :");
			option = scan.nextInt();
			switch (option) {
			case 1: {
				System.out.println(balance);
				break;
			}
			case 2: {
				try {
					System.out.println("enter withdraw amount");
					withdrawAmount = scan.nextLong();
					if (withdrawAmount < balance) {
						balance = balance - withdrawAmount;
						System.out.println(balance);
					} else {
						System.out.println("withdraw amount is more your balance");
					}
					break;
				}catch (Exception e ) {
					
					e.printStackTrace();
				}
			}
			case 3: {
				System.out.println("Enter deposite amount :");
				deposite = scan.nextLong();
				balance = balance + deposite;
				System.out.println(balance);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
				
			}
			
			
			} while (option!=4);
		
		
		
		
		scan.close();
		}
	
}
