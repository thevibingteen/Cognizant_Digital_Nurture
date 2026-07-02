import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(1000);
        System.out.println("Test Started");
    }

    @After
    public void tearDown() {
        account = null;
        System.out.println("Test Finished");
    }

    @Test
    public void testDeposit() {

        // Arrange
        double amount = 500;

        // Act
        account.deposit(amount);

        // Assert
        assertEquals(1500, account.getBalance(), 0.0);

    }

}