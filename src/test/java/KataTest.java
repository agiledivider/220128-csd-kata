import org.junit.Test;
import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void firstTest() {
        assertTrue(isPalindrom("a"));
    }

    @Test
    public void secondTest(){
        assertFalse(isPalindrom("ab"));
    }

    private boolean isPalindrom(String a) {
        return true;
    }
}
