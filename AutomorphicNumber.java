public class AutomorphicNumber {
    public static void main(String[] args) {
        int n = 25;
        int length = lengthOfNumber(n);

        int squaredNum = n*n;
       

        int reversed = reverseSelectedDigits(squaredNum, length);


        int lastDigit = reverseNumber(reversed);


        if(n==lastDigit)
            System.out.println("true");
    }





    private static int lengthOfNumber(int n) {
        int count = 0;

        // If n is 0, it has 1 digit
        if (n == 0) {
            return 1;
        }

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    private static int lastDigitFinder(int length, int n) {
        int reversedNum = 0;
        while (length > 0) {
            int lastDigit = n % 10;

            reversedNum = reversedNum * 10 + lastDigit;

            n = n / 10;

        }

        return reversedNum;
    }
    private static int reverseSelectedDigits(int num, int length) {
        int reversedNum = 0;
        int count = 0;

        while (num > 0 && count < length) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num = num / 10;
            count++;
        }

        return reversedNum;
    }

    private static int reverseNumber(int Number) {
        int reversedNumber = 0;
        while (Number != 0) {
            int digit = Number % 10;

            reversedNumber = reversedNumber * 10 + digit;
            Number = Number / 10;

        }
        return reversedNumber;
    }

}
