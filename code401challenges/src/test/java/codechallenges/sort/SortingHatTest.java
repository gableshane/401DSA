package codechallenges.sort;

import org.junit.*;

import static org.junit.Assert.*;

public class SortingHatTest {

    @Test
    public void insertionSortTestHappyPath() {

        int[] ari = new int[]{8,6,4,9,12};
        int[] expected = new int[]{4,6,8,9,12};
        SortingHat.insertionSort(ari);
        assertArrayEquals("Array should be sorted",expected,ari);
    }

    @Test
    public void insertionSortTestExpectedFailure(){

        int[] ari = new int[]{};

        try {
            SortingHat.insertionSort(ari);
            assertTrue(false);
        } catch(Exception e){
            assertTrue(true);
        }
    }
}