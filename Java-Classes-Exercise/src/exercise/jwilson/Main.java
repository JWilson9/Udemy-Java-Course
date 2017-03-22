package exercise.jwilson;

/**
 * Created by jwilson on 22/03/2017.
 */
public class Main {

    public static void main(String[] args){
        BankAccount userBankAccount = new BankAccount();
        userBankAccount.setAccountNumber("1234H");
        userBankAccount.setBalance(10000);
        userBankAccount.setCustomerName("James Wilson");
        userBankAccount.setEmail("james@gmail.com");
        userBankAccount.setPhoneNumber(12121212);
        userBankAccount.setDeposit(22);
        System.out.println(userBankAccount.getBalance());


        System.out.println("the user's bank account number is:" + userBankAccount.getAccountNumber());

        System.out.println("he");
    }
}
