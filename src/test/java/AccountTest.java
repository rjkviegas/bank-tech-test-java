import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void TestAccountInitialisesWithInitialBalance() {
        Account account = new Account();

        int expectedInitialBalance = 0;
        int actualInitialBalance = account.getBalance();

        assertEquals(expectedInitialBalance, actualInitialBalance);
    }
}
