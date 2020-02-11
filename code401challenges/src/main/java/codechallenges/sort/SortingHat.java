package codechallenges.sort;

public class SortingHat {

    public static void insertionSort(int[] arr){

        if(arr.length == 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }


        for(int i = 1; i < arr.length; i++){

            int j = i - 1;
            int temp = arr[i];

            while(j >= 0 && temp < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }
}
