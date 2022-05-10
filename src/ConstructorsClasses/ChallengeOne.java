package ConstructorsClasses;

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

public class ChallengeOne {
    public static void main (String[] args){

        ChallengeOne one = new ChallengeOne(1,100,"Aiden", "Aiden@me.com", "403-333-3333");
        System.out.println("Account Number: " + one.getAccountNumber());
        System.out.println("Balance: " + one.getBalance());
        System.out.println("Name: " + one.getCustomerName());
        System.out.println("Email: " + one.getEmail());
        System.out.println("Phone Number: " + one.getPhoneNumber());

        System.out.println();

        one.deposit(100);

        System.out.println();

        one.withdraw(1);
    }

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public ChallengeOne() {
    }

    public ChallengeOne(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
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

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " has been made"
            + "\nNew balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount){
        if(this.balance - withdrawAmount < 0){
            System.out.println("Insufficient funds");
        }else{
            this.balance -= withdrawAmount;
            System.out.println("Updated balance " + this.balance);
        }
    }

}
