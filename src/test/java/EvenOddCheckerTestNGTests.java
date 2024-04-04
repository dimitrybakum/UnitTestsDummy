import org.testng.annotations.*;
import java.lang.reflect.Method;
import static org.testng.AssertJUnit.*;

public class EvenOddCheckerTestNGTests {

  @Test
  public void testEvenChecker() {
    assertTrue("Not an even", (EvenOddChecker.check(10)));
    System.out.println("Passed");
  }

  @Test
  public void testOddChecker() {
    assertFalse("Not an odd", (EvenOddChecker.check(5)));
    System.out.println("Passed");
  }

  @BeforeMethod
  public void name(Method method) {
    System.out.println("TestNG: " + method.getName() + " test..");
  }
}
