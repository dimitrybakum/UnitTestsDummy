import org.testng.annotations.*;
import java.lang.reflect.Method;
import static org.testng.AssertJUnit.*;

public class RectangleTestNGTests {
    Rectangle rectangle = new Rectangle(2,3);

  @Test
  public void testRectangleLength() {
    assertEquals("The length is different", 2.0, rectangle.getLength());
    System.out.println("Passed");
  }
  @Test
  public void testRectangleWidth() {
    assertEquals("The length is different", 3.0, rectangle.getWidth());
    System.out.println("Passed");
  }
  @Test
  public void testRectangleArea() {
    assertEquals("The area is different", 6.0, rectangle.getArea());
    System.out.println("Passed");
  }
  @BeforeMethod
  public void name(Method method) {
    System.out.println("TestNG: " + method.getName() + " test..");
  }
}
