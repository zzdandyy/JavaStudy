package day06.study11;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        int[] arr = {19, 50, 28, 37, 46};
        int intMax = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(intMax);
    }

    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
