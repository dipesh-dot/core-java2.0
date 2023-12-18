import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {


        String str1 = "grab";
        String str2 = "brag";
        Boolean ans = false;

        check(str1, str2);
//        System.out.println(result);


    }

    static void check(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length()!=str2.length()) {
            System.out.println(" they are not anagram 1");
        }
        char[] a = str1.toCharArray();


        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a,b)) {
            System.out.println(" they are anagram");
        } else {
            System.out.println(" they are not anagram");
        }

    }

}
