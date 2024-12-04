import java.util.Random;

import static java.util.Collections.swap;

public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(100);
        }
        printArray(intArray);

        quickSort(intArray, 0, intArray.length-1);
        printArray(intArray);
    }

    public static void quickSort(int[] array, int low, int high){
        if (low >= high){
            return;
        }

        int pivot = array[high];
        int left = low;
        int right = high;

        while(left < right){
            while (array[left] <= pivot && left < right){
                left++;
            }

            while (array[right] >= pivot && left < right){
                right--;
            }
            swap(array, left, right);
        }
        swap(array, left, high);

        quickSort(array, low, left-1);
        quickSort(array, left+1, high);
    }


    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] array){
        System.out.println("Array");
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("------------");
    }
}
