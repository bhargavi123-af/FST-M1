import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class Activity2 {

	@Test
	public void notEnoughFunds() {
		
		BankAccount ba = new BankAccount(50);
		assertThrows(NotEnoughFundsException.class, () -> ba.withdraw(100), "Balance must be greater than withdrawl Amount");
		
	}
	@Test
	public void enoughFunds() {
		BankAccount ba = new BankAccount(50);
		assertDoesNotThrow(() -> ba.withdraw(40));
		
		
	}
}
