import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.*;

public class EvenOddCheckerJUnitTests {

  @Rule public TestName name = new TestName();

  @Test
  public void testEvenChecker() {
    System.out.printf("JUnit: %s test..%n", name.getMethodName());
    assertTrue("Not an even", (EvenOddChecker.check(10)));
    System.out.println("Passed");
  }

  @Test
  public void testOddChecker() {
    System.out.printf("JUnit: %s test..%n", name.getMethodName());
    assertFalse("Not an odd", (EvenOddChecker.check(5)));
    System.out.println("Passed");
  }
}
