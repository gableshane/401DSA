package codechallenges.urlfix;

import org.junit.*;

import static org.junit.Assert.*;

public class UrlSanitizeTest {

    @Test
    public void fixURL() {
        assertEquals("%20",UrlSanitize.fixURL(" "));
    }
    @Test
    public void testAgain(){
        String expected = "%20banana%20";
        assertEquals(expected,UrlSanitize.fixURL(" banana "));
    }
}