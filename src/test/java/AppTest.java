import models.Hangman;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/3/18.
 */
public class AppTest {

    @Test
    public void hangman_hasWords() {
        Hangman hangman = new Hangman();
        String test = hangman.pickRandomWord();
        boolean x;
        if (test instanceof String) {
            x = true;
        } else {
            x = false;
        }
        assertEquals(true, x);
    }
    @Test
    public void hangman_wordIsSplit() {
        Hangman hangman = new Hangman();
        String[] test = hangman.splitWord();
        boolean x;
        if(test.length > 1){
            x = true;
        } else {
            x = false;
        }
        assertEquals(true, x);
    }
    @Test
    public void hangman_takesInput() {
        Hangman hangman = new Hangman();
        String userInput = "a";
        assertEquals("a", hangman.userInput(userInput));
    }
}