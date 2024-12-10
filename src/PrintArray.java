public class PrintArray {
    public static void printArray(int[] array){
        System.out.print("[");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }
}
