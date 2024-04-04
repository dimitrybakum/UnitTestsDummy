import org.testng.annotations.*;
import java.lang.reflect.Method;
import static org.testng.AssertJUnit.*;

public class CalculatorTestNGTests {

  Calculator calculator = new Calculator();

  @Test
  public void testCalculatorSum() {
    assertEquals("The sum result is wrong", calculator.add(10, 5), 15);
    System.out.println("Passed");
  }

  @Test
  public void testCalculatorSubtract() {
    assertEquals("The subtract result is wrong", 10, calculator.subtract(15, 5));
    System.out.println("Passed");
  }

  @Test
  public void testCalculatorMultiply() {
    assertEquals("The multiply result is wrong", 20, calculator.multiply(5, 4));
    System.out.println("Passed");
  }

  @Test
  public void testCalculatorDivide() {
    assertEquals("The divide result is wrong", 3, calculator.divide(18, 6));
    System.out.println("Passed");
  }

  @BeforeMethod
  public void name(Method method) {
    System.out.println("TestNG: " + method.getName() + " test..");

  }
}
