import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    private Account account;

    @Before
    public void createAccount() {
        account = new Account();
    }

    @Test
    public void TestAccountInitialisesWithInitialBalance() {
        int expectedInitialBalance = 0;
        int actualInitialBalance = account.getBalance();

        assertEquals(expectedInitialBalance, actualInitialBalance);
    }

    @Test
    public void TestDepositAmountIncreasesBalance() {
        int amount = 1000;
        account.deposit(amount);

        int expectedBalance = amount;
        int actualBalance = account.getBalance();

        assertEquals(expectedBalance, actualBalance);
    }
}
