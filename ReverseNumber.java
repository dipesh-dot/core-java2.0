public class ReverseNumber {
    public static void main(String[] args) {
        int Number = 12345;
        int result = reverseNumber(Number);
        System.out.println(result);
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
