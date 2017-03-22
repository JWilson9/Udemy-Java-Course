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
    private double deposit;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalance(){
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

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getDeposit() {
        return this.deposit;
    }


}
