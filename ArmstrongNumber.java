public class ArmstrongNumber {
    public static void main(String[] args) {
        int  n = 153;

        boolean result = CheckArmstrongNumber(n);
        System.out.println(result);

    }

    private static boolean CheckArmstrongNumber(int n) {
        int orginalNumber = n;
        int NumberLength = checkLengthOfNumber(n);
        int finalAns = 0;
        while (n != 0) {
            int digit = n % 10;

            finalAns += calculate(digit, NumberLength);
            n=n/10;

        }


        System.out.println(finalAns);
        if(finalAns==orginalNumber)
            return true;
        else
            return false;



    }

    private static int checkLengthOfNumber(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    public static int calculate(int base, int exponent) {

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }
}