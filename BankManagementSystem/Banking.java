package BankManagementSystem;

import java.util.Scanner;

class Banking {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("Angel", "KA0001");
        obj1.showMenu();
    }
}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No Transaction Occurred");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("##### Bank Management System #####");
        System.out.println("******************************************");
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is: " + customerId);
        System.out.println("******************************************");

        do {
            System.out.println("Choose an option:");
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Previous Transaction");
            System.out.println("E. Exit");
            option = scanner.next().charAt(0);
            System.out.println("******************************************");

            switch (option) {
                case 'A':
                    System.out.println("Balance = " + balance);
                    break;
                case 'B':
                    System.out.println("Enter an amount to deposit:");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    break;
                case 'C':
                    System.out.println("Enter an amount to withdraw:");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    break;
                case 'D':
                    getPreviousTransaction();
                    break;
                case 'E':
                    System.out.println("Thank you for using our services.");
                    break;
                default:
                    System.out.println("Invalid option. Please enter again.");
                    break;
            }
        } while (option != 'E');

        scanner.close();
    }
}

