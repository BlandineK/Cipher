import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CaesarTest {

    @Test
    public void runCaesar_letters_ArrayList() {
        Caesar testCaesar = new Caesar();
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("a");
        assertEquals(expectedOutput, testCaesar.runCaesar("a"));
    }
}