package exercise.jwilson;

/**
 * Created by jwilson on 30/03/2017.
 */
public class VipCustomer {

    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("paddy", 10000, "paddy@email.com");
    }

    public VipCustomer(String customerName, double creditLimit){
        this(customerName, creditLimit, "unknown");
    }

    public VipCustomer(String customerName, double creditLimit, String emailAddress){

        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    //getters
    public String getCustomerName(){
        return this.customerName;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }

    public String getEmailAddress(){
        return this.emailAddress;
    }



}


