public class Pallindrome_number {

    public static void main(String[] args) {

        //pallindrome means when we reverse the digit it remain same .

        int n = 16461;
        int result = reverse(n);

        if (n == result)
            System.out.println("it is pallindrome number");
        else
            System.out.println("it is not pallindrome");
    }

    public static int reverse(int n) {
        int reversedNumber = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n = n / 10;
        }

        return reversedNumber;

    }

}
