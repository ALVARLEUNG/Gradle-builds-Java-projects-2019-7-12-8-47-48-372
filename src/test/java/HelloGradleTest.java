import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class HelloGradleTest {

    @Test
    public void should_return_string_when_call_hello_gradle () {
        HelloGradle helloGradle = new HelloGradle();
        assertEquals("This is a Gradle Project.", helloGradle.helloGradle());
    }

    @Test
    public void testMockClass() throws Exception {
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        String value = "first";
        when(mockedList.get(0)).thenReturn(value);

        assertEquals(mockedList.get(0), value);

    }
}
