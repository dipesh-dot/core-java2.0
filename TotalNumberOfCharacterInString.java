public class TotalNumberOfCharacterInString {
    public static void main(String[] args) {

        String str = "DIPESH";
        int length = str.length();
        System.out.println(length);

        for (int i = 0;i<str.length();i++){

           char c = str.charAt(i);

            System.out.println(c);
        }
    }
}
