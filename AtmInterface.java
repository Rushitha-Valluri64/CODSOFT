import java.util.Scanner;
import java.util.ArrayList;

public class AtmInterface {
    public static void main(String[] args) {
        int withdrawal, deposit, transfer;
        int balance = 10000;
        long acnum;
        ArrayList<String> transactionHistory = new ArrayList<>();

        System.out.println("Welcome! to the ATM");
        System.out.println(" You can perform the following operations \n 1. Withdraw \n 2. Deposit \n 3. Transfer \n 4. Transaction History \n 5. Quit \n Please kindly choose the number on which operation you need to perform");
	int choice;
        do {
	    Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();  

            if (choice == 1) {
                System.out.println("Enter amount to withdraw");
                withdrawal = sc.nextInt();
                if (withdrawal <= balance) {
                    balance = balance - withdrawal;
                    System.out.println("Amount withdrawal has been done successfully");
		    System.out.println("Please collect your money");
                    System.out.println("Balance amount is " + balance);
                    transactionHistory.add("Withdrawal: " + withdrawal);
                } else {
                    System.out.println("Insufficient balance to perform withdrawal");
                }
System.out.println("You can perform transaction again \n Please kindly choose the number on which operation you need to perform ");
            } else if (choice == 2) {
                System.out.println("Enter amount to deposit");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Amount deposit has been done successfully");
                System.out.println("Balance amount is " + balance);
                transactionHistory.add("Deposit: " + deposit);
System.out.println("You can perform transaction again \n Please kindly choose the number on which operation you need to perform ");
            } else if (choice == 3) {
                System.out.println("Enter account number to transfer money");
                acnum = sc.nextLong();
                System.out.println("Enter amount to transfer");
                transfer = sc.nextInt();
                if (transfer < balance) {  // Add balance check for transfer
                    System.out.println("Amount transferred successfully");
                    balance = balance - transfer;
                    System.out.println("Balance amount is " + balance);
                    transactionHistory.add("Transferred: " + transfer);
                } else {
                    System.out.println("Insufficient balance to perform transfer");
                }
System.out.println("You can perform transaction again \n Please kindly choose the number on which operation you need to perform ");
            } else if (choice == 4) {
                System.out.println("Your transaction history is:");
                for (String transaction : transactionHistory) {
                    System.out.println(transaction);
                }
System.out.println("You can perform transaction again \n Please kindly choose the number on which operation you need to perform ");
            } else if (choice == 5) {
                System.out.println("Thank You!");
                System.exit(0);
            } else {
                System.out.println("Invalid choice \n Please enter your choice between 1 and 5");
            }
        }
	while (choice != 5);
    }
}
