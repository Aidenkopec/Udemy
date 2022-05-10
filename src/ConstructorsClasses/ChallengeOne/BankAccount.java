package ConstructorsClasses.ChallengeOne;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class BankAccount {
    public static void main(String[] args) {

        BankAccount one = new BankAccount(1, 100, "Aiden", "Aiden@me.com", "403-333-3333");
        System.out.println("Account Number: " + one.getAccountNumber());
        System.out.println("Balance: " + one.getBalance());
        System.out.println("Name: " + one.getCustomerName());
        System.out.println("Email: " + one.getEmail());
        System.out.println("Phone Number: " + one.getPhoneNumber());

        System.out.println();

        one.deposit(200);

        System.out.println();

        one.withdraw(1);
        one.withdraw(25);
        one.withdraw(23);
        one.withdraw(5);

        System.out.println();

        BankAccount two = new BankAccount("Jack", "jack123@me.com", "403-222-1111");
        System.out.println("Balance: " + two.getBalance());
        System.out.println("Account Number: " + two.getAccountNumber());

        System.out.println();

        BankAccount three = new BankAccount();
//        System.out.println(three.getAccountNumber());

    }

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        System.out.println("Empty Constructor Called");
//        this(56789, 2.50, "aidennn", "hi@me.com", "333-333-3333");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " has been made"
                + "\nNew balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Updated balance " + this.balance);
        }
    }

}
