import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertTrue;

/**
 * Created by jwilson on 29/06/2017.
 */
public class BankAccountTest {
    @org.junit.Test
    public void deposit() throws Exception {
        BankAccount bankAccount = new BankAccount("James", "Wilson",    1000.00, BankAccount.CHECKING);
        double balance = bankAccount.deposit(200.00, true);
        assertEquals(1200, balance, 0);
        assertEquals(1200, bankAccount.getBalance(), 0);

    }

    @org.junit.Test
    public void withdraw() throws Exception {
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        BankAccount bankAccount = new BankAccount("James", "Wilson",    1000.00, BankAccount.CHECKING);
        bankAccount.deposit(200.00, true);
        assertEquals(1200, bankAccount.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        BankAccount bankAccount = new BankAccount("James", "Wilson",    1000.00, BankAccount.CHECKING);
        bankAccount.withdraw(200.00, true);
        assertEquals(800, bankAccount.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true(){
        BankAccount bankAccount = new BankAccount("James", "Wilson",    1000.00, BankAccount.CHECKING);
        assertTrue(bankAccount.isChecking());
    }




}