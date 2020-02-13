package codechallenges.sort;

// https://www.techiedelight.com/get-slice-primitive-array-java/ used for reference

import java.lang.reflect.*;
import java.util.*;

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

    public static void mergeSort(int[] arr){

        if(arr.length == 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int n = arr.length;

        if(n > 1){

            int mid = n / 2;

            int[] left = Arrays.copyOfRange(arr,0,mid);

            int[] right = Arrays.copyOfRange(arr,mid,n);

            mergeSort(left);

            mergeSort(right);

            merge(left, right, arr);

        }
    }

    public static void merge(int[] left, int[] right, int[] arr){

        int i = 0;

        int j = 0;

        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        if(i == left.length){
            while(k < arr.length){
                arr[k] = right[j];
                k++;
                j++;
            }
        } else {
            while(k < arr.length){
                arr[k] = left[i];
                k++;
                i++;
            }
        }
    }

    public static void quickSort(int[] arr,int left, int right){

        if(arr.length == 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }

        if (left < right){

            int position = partition(arr, left, right);

            quickSort(arr, left, position - 1);
            quickSort(arr, position + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right){

        int pivot = arr[right];
        int low = left - 1;

        for(int i = left; i < right; i++){
            if(arr[i] <= pivot){
                low++;
                swap(arr,i,low);
            }
        }
        swap(arr, right, low + 1);

        return low + 1;
    }

    public static void swap(int[] arr, int i, int low){

        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }
}
