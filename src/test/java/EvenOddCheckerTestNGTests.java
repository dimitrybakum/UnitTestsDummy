import org.testng.annotations.*;
import java.lang.reflect.Method;
import org.testng.Assert;

public class EvenOddCheckerTestNGTests {

  @Test
  public void testEvenChecker() {
    Assert.assertTrue((EvenOddChecker.check(10)), "Not an even");
    System.out.println("Passed");
  }

  @Test
  public void testOddChecker() {
    Assert.assertFalse((EvenOddChecker.check(5)), "Not an odd");
    System.out.println("Passed");
  }

  @BeforeMethod
  public void name(Method method) {
    System.out.println("TestNG: " + method.getName() + " test..");
  }
}
