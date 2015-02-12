import org.junit.Test;
import static org.junit.Assert.*;

public class SumOfDigitsTest{
	
	@Test
	public void testSumOfDigits(){
		assertEquals(6,SumOfDigits.sumOfDigits(123));
		assertEquals(11, SumOfDigits.sumOfDigits(29));
		assertEquals(1,SumOfDigits.sumOfDigits(1));
	}

	@Test
	public void testIsumOfDigits(){
		assertEquals(6, SumOfDigits.isumOfDigits(123));
		assertEquals(11, SumOfDigits.isumOfDigits(29));
		assertEquals(1,SumOfDigits.isumOfDigits(1));
	}
}