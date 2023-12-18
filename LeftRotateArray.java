import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5, 6};


        int n = 2;

        for (int i = 0; i < n; i++) {

            int first;
            int j;
            first = a[0];
            for (j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[j] = first;
        }
        System.out.println(Arrays.toString(a));
    }
}
