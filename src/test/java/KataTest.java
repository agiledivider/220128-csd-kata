import org.junit.Test;
import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void anyOneCharacterWordIsAPalindrome() {
        assertTrue(isPalindrom("a"));
    }

    @Test
    public void anyTwoDifferentCharactersAreNotAPalindrome(){
        assertFalse(isPalindrom("ab"));
    }
    @Test
    public void test3(){
        assertTrue(isPalindrom("aa"));
    }



    private boolean isPalindrom(String word) {
        if(word.length() == 1) {
            return true;
        }
        return false;
    }
}
