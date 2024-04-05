import org.testng.annotations.*;
import java.lang.reflect.Method;
import org.testng.Assert;

public class RectangleTestNGTests {
    Rectangle rectangle = new Rectangle(2,3);

  @Test
  public void testRectangleLength() {
    Assert.assertEquals(rectangle.getLength(), 2.0, "The length is different");
    System.out.println("Passed");
  }
  @Test
  public void testRectangleWidth() {
    Assert.assertEquals(rectangle.getWidth(), 3.0, "The length is different");
    System.out.println("Passed");
  }
  @Test
  public void testRectangleArea() {
    Assert.assertEquals(rectangle.getArea(), 6.0, "The area is different");
    System.out.println("Passed");
  }
  @BeforeMethod
  public void name(Method method) {
    System.out.println("TestNG: " + method.getName() + " test..");
  }
}
