public class GivenStringISPallindrome {

    public static void main(String[] args) {
        String str = "radar";  // Remove the leading space for accurate palindrome check
        boolean result = isPalindrome(str);
        System.out.println(result);
    }

    private static boolean isPalindrome(String str) {
        int length = str.length()-1;


        StringBuilder strReversed = new StringBuilder();

        for (int i = length; i >= 0; i--) {
            char reversed = str.charAt(i);
            strReversed.append(reversed);
        }

        System.out.println(strReversed);

        // Use equalsIgnoreCase() to perform a case-insensitive check
        return str.equalsIgnoreCase(strReversed.toString());
    }
}
