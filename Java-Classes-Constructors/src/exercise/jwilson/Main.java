package exercise.jwilson;

/**
 * Created by jwilson on 22/03/2017.
 */
public class Main {

    public static void main(String[] args) {
        BankAccount userBankAccount = new BankAccount("1234H", 1000, "James Wilson", "james@gmail.com", 1233);
        BankAccount defaultAccount = new BankAccount();
        BankAccount jonsAccount = new BankAccount("Jon", "jon@email.com", 123456);
        System.out.println("the user's bank account number is:" + userBankAccount.getAccountNumber());
        System.out.println(userBankAccount.getBalance());
        System.out.println(defaultAccount.getBalance());
        userBankAccount.withdrawal(11);
        System.out.println("Jons number is " + jonsAccount.getPhoneNumber());

        // VIP Customer Class
        VipCustomer paddy = new VipCustomer();
        VipCustomer james = new VipCustomer("james", 100000);
        VipCustomer ben = new VipCustomer("Ben", 1234, "Ben@gmail.com");
        System.out.println(paddy.getCustomerName() + " "+ paddy.getCreditLimit() + " " + paddy.getEmailAddress());
        System.out.println(james.getCustomerName() + " "+ james.getCreditLimit() + " " + james.getEmailAddress());
        System.out.println(ben.getCustomerName() + " "+ ben.getCreditLimit() + " " + ben.getEmailAddress());


    }


}
