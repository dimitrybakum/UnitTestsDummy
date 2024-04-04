import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import static org.junit.Assert.assertEquals;

public class CalculatorJUnitTests {

  @Rule public TestName name = new TestName();
  Calculator calculator = new Calculator();

  @Test
  public void testCalculatorSum() {
    System.out.printf("JUnit: %s test..%n", name.getMethodName());
    assertEquals("The sum result is wrong", 10, calculator.add(5, 5));
    System.out.println("Passed");
  }

  @Test
  public void testCalculatorSubtract() {
    System.out.printf("JUnit: %s test..%n", name.getMethodName());
    assertEquals("The subtract result is wrong", 15, calculator.subtract(20, 5));
    System.out.println("Passed");
  }

  @Test
  public void testCalculatorMultiply() {
    System.out.printf("JUnit: %s test..%n", name.getMethodName());
    assertEquals("The multiply result is wrong", 18, calculator.multiply(3, 6));
    System.out.println("Passed");
  }

  @Test
  public void testCalculatorDivide() {
    System.out.printf("JUnit: %s test..%n", name.getMethodName());
    assertEquals("The divide result is wrong", 4, calculator.divide(16, 4));
    System.out.println("Passed");
  }
}
