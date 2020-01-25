package codechallenges.utilities;

import org.junit.*;

import static org.junit.Assert.*;

public class MultiBracketChallengeTest {

    @Test
    public void testSquareTrue(){
        String test = "[]";
        assertTrue("Balanced square brackets should return true",MultiBracketChallenge.multiBracketValidation(test));
    }
    @Test
    public void testSquaresTrue(){
        String test = "[[]]";
        assertTrue("Balanced square brackets should return true",MultiBracketChallenge.multiBracketValidation(test));
    }
    @Test
    public void testSquaresFalse(){
        String test = "[[";
        assertFalse("Unbalanced brackets should return false",MultiBracketChallenge.multiBracketValidation(test));
    }
    @Test
    public void testSquiggleTrue(){
        String test = "{}";
        assertTrue("Balanced squiggle brackets should return true",MultiBracketChallenge.multiBracketValidation(test));
    }
    @Test
    public void testSquigglesTrue(){
        String test = "{{}}";
        assertTrue("Balanced squiggle brackets should return true",MultiBracketChallenge.multiBracketValidation(test));
    }
    @Test
    public void testSquigglesFalse(){
        String test = "{{";
        assertFalse("Unbalanced curly brackets should return false",MultiBracketChallenge.multiBracketValidation(test));
    }
    @Test
    public void testRoundTrue(){
        String test = "()";
        assertTrue("Balanced round brackets should return true",MultiBracketChallenge.multiBracketValidation(test));
    }
    @Test
    public void testRoundsTrue(){
        String test = "()";
        assertTrue("Balanced round brackets should return true",MultiBracketChallenge.multiBracketValidation(test));
    }
    @Test
    public void testRoundsFalse(){
        String test = "((";
        assertFalse("Unbalanced round brackets should return false",MultiBracketChallenge.multiBracketValidation(test));
    }
    @Test
    public void mixTestTrue(){
        String test = "{[()]}";
        assertTrue("Balanced mix of brackets should return true",MultiBracketChallenge.multiBracketValidation(test));
    }
    @Test
    public void mixTestFalse(){
        String test = "{{[}})";
        assertFalse("Unbalanced mix of bracket should return false",MultiBracketChallenge.multiBracketValidation(test));
    }

}