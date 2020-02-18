package codechallenges.hashtable;

import org.junit.*;


public class HashTableTest {

    HashTable hashy;

    @Before
    public void instantiateHashy(){
        hashy = new HashTable();
        hashy.add("TestContains","Test");
    }

    @Test
    public void add() {
        hashy.add("shane","Gable");
        Assert.assertTrue(hashy.contains("shane"));
    }

    @Test
    public void get() {
        hashy.add("Dayne","Daylong");
        Assert.assertEquals("Daylong",hashy.get("Dayne"));
    }

    @Test
    public void contains() {
        Assert.assertTrue(hashy.contains("TestContains"));
    }

    @Test
    public void testGetFail(){
        Assert.assertNull(hashy.get("Sergey"));
    }

    @Test
    public void testConflict(){
        hashy.add("taco","taco");
        hashy.add("ocat","ocat");
        Assert.assertEquals("taco",hashy.get("taco"));
        Assert.assertEquals("ocat",hashy.get("ocat"));
    }
}