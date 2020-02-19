package repeatedword;

import org.junit.*;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void testRepeatedWordHappyPath(){
        assertEquals("a",RepeatedWord.repeatedWord("a biscuit lives a short life"));
    }

    @Test
    public void testRepeatedWordHappy(){
        assertNull(RepeatedWord.repeatedWord("No repeated words"));
    }

    @Test
    public void testRepeatedWordEdgeCases(){
        assertEquals("banana",RepeatedWord.repeatedWord("Banana apple banana."));
    }
}