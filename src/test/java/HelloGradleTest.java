import org.junit.Assert;
import org.junit.Test;

public class HelloGradleTest {

    @Test
    public void should_return_string_when_call_hello_gradle () {
        HelloGradle helloGradle = new HelloGradle();
        Assert.assertEquals("This is a Gradle Project.", helloGradle.helloGradle());
    }
}
