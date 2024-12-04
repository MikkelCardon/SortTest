import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class SwapTest {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(List.of(3,2,1));

        swap(integerArrayList, 0, 2);

        System.out.println(integerArrayList);
    }
}
