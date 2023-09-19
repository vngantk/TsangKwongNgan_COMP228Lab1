import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;

/**
 * Unit Test class for Driver.java. It uses Mockito to mock the System.out object.
 */
public class DriverTest {

    @Test
    public void test_main_method() {
        PrintStream out = mock(PrintStream.class);
        InOrder inOrder = org.mockito.Mockito.inOrder(out);
        System.setOut(out);
        Driver.main(new String[0]);
        inOrder.verify(out).println("Details of Singer created with default constructor:");
        inOrder.verify(out).println("Singer ID: 0");
        inOrder.verify(out).println("Singer Name: null");
        inOrder.verify(out).println("Singer Address: null");
        inOrder.verify(out).println("Singer Date of Birth: null");
        inOrder.verify(out).println("Singer Albums Published: 0");
        inOrder.verify(out).println();
        inOrder.verify(out).println("Details of Singer updated with setter methods:");
        inOrder.verify(out).println("Singer ID: 12345");
        inOrder.verify(out).println("Singer Name: Justin Bieber");
        inOrder.verify(out).println("Singer Address: 1234 Hollywood Blvd, Los Angeles, CA 90027");
        inOrder.verify(out).println("Singer Date of Birth: 1994-03-01");
        inOrder.verify(out).println("Singer Albums Published: 5");
        inOrder.verify(out).println();
    }

    @Test
    public void test_printSingerDetails_method() {
        PrintStream out = mock(PrintStream.class);
        InOrder inOrder = org.mockito.Mockito.inOrder(out);
        System.setOut(out);
        Singer singer = new Singer(12345, "Justin Bieber", "1234 Hollywood Blvd, Los Angeles, CA 90027", "1994-03-01", 5);
        Driver.printSingerDetails(singer);
        inOrder.verify(out).println("Singer ID: 12345");
        inOrder.verify(out).println("Singer Name: Justin Bieber");
        inOrder.verify(out).println("Singer Address: 1234 Hollywood Blvd, Los Angeles, CA 90027");
        inOrder.verify(out).println("Singer Date of Birth: 1994-03-01");
        inOrder.verify(out).println("Singer Albums Published: 5");
        inOrder.verify(out).println();
    }
}
