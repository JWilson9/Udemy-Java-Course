package exercise.jwilson;

/**
 * Created by jwilson on 22/03/2017.
 */
public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private double phoneNumber;


    public BankAccount() {
        this("3432", 2.50, "default name", "default email address", 123456);
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, double phoneNumber) {
        System.out.println("bank account constructor with param's");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, double phoneNumber) {
        this("9999j", 100.34, customerName, email, phoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalance() {

        return this.balance;
    }


    public void setCustomerName(String customerName) {

        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(double phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public double getPhoneNumber() {

        return this.phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount <= 0) {
            System.out.println("you  do not have enough in your account");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("your balance is " + this.balance);
        }

    }


}
