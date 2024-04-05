import org.testng.annotations.*;
import java.lang.reflect.Method;
import org.testng.Assert;

public class CalculatorTestNGTests {

  Calculator calculator = new Calculator();

  @Test
  public void testCalculatorSum() {
    Assert.assertEquals(calculator.add(10, 5), 15, "The sum result is wrong" );
    System.out.println("Passed");
  }

  @Test
  public void testCalculatorSubtract() {
    Assert.assertEquals(calculator.subtract(15, 5), 10, "The subtract result is wrong");
    System.out.println("Passed");
  }

  @Test
  public void testCalculatorMultiply() {
    Assert.assertEquals(calculator.multiply(5, 4), 20, "The multiply result is wrong");
    System.out.println("Passed");
  }

  @Test
  public void testCalculatorDivide() {
    Assert.assertEquals(calculator.divide(18, 6), 3, "The divide result is wrong");
    System.out.println("Passed");
  }

  @BeforeMethod
  public void name(Method method) {
    System.out.println("TestNG: " + method.getName() + " test..");

  }
}
