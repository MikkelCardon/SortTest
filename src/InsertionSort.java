import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Pre-sorted: ");
        PrintArray.printArray(numbers);

        System.out.println("Sorted: ");
        sort(numbers);
    }

    public static int[] sort(int[] numbers){

        for (int i = 1; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int j = i-1;
            while(j >= 0 && numbers[j] > currentNumber){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = currentNumber;
            PrintArray.printArray(numbers);
        }
        return numbers;
    }
}
