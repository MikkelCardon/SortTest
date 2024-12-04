import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Pre-sorted: ");
        for (int number : numbers) {
            System.out.println(number);
        }

        for (int number : sort(numbers)) {
            System.out.println(number);
        }
    }

    public static int[] sort(int[] array){
        boolean notSorted = true;

        while (notSorted){
            notSorted = false;

            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    notSorted = true;
                }
            }
        }

        System.out.println("array sorted: ");
        return array;
    }
}
