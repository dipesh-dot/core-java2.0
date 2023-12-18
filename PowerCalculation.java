public class PowerCalculation {
    public static void main(String[] args) {

        int ans = calculate(2, 2);
        System.out.println(ans);
    }

    public static int calculate(int base, int exponent) {

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }
}
