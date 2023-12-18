public class FactorialNumber {
    public static void main(String[] args) {

        int n = 5 ;

        int ans = factorialOf(n);
        System.out.println(ans);

    }

//    private static int factorialOf(int n) {
//        return n * (n - 1);
//    }

    private static int factorialOf(int n) {
        int result = 1;

        while (n >= 1) {
            result *= n;
            n--;
        }

        return result;
    }
}
