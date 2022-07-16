import org.testng.annotations.Test;
import static org.testing.Assert.assertEquals;

@Test
public class TestCalculate {
	
	private Calculator calculator;
	
	@BeforeTest
	public void init() {
		calculator = new Calculator();
	}
	
	public void emptyStringReturnsZero() throws Exception{
//		Calculator calculator = new Calculator();
		assertEquals(calculator.calculate(""),0);
		
	}
	
	public void singleValueIsReplied() throws Exception{
//		Calculator calculator = new Calculator();
		assertEquals(calculator.calculate("1"),1);
	}
	
	public void twoNumbersCommaDelimitedReturnSum() throws Exception {
		assertEquals(calculator.calculate("1,2"),3);
	}
	
	public void twoNumbersNewlineDelimitedReturnSum() throws Exception {
		assertEquals(calculator.calculate("1\n2"),3);
	}
	public void threeNumbersDelimitedReturnsSum() throws Exception {
		assertEquals(calculator.calculate("1,2,3"),6);
	}
	
	@Test(expectedExceptions=Exception.class)
	public void negativeInputReturnsException() {
		calculator.calculate("-1");
	}
}
