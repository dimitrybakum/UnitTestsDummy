import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.testng.AssertJUnit;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class RectangleJUnitTests {
  @Rule public TestName name = new TestName();
  Rectangle rectangle = new Rectangle(5, 3);

  @Test
  public void testRectangleLength() {
    System.out.printf("JUnit: %s test..%n", name.getMethodName());
    AssertJUnit.assertEquals("The length is different", 5.0, rectangle.getLength());
    System.out.println("Passed");
  }

  @Test
  public void testRectangleWidth() {
    System.out.printf("JUnit: %s test..%n", name.getMethodName());
    AssertJUnit.assertEquals("The length is different", 3.0, rectangle.getWidth());
    System.out.println("Passed");
  }

  @Test
  public void testRectangleArea() {
    System.out.printf("JUnit: %s test..%n", name.getMethodName());
    AssertJUnit.assertEquals("The area is different", 15.0, rectangle.getArea());
    System.out.println("Passed");
  }
}
