public class ReverseString {
    public static void main(String[] args) {

        String orginal = "Dipesh";


        orginal = orginal.toLowerCase();
        int length = orginal.length() - 1;

       String result =" ";

        for (int i = length; i >= 0; i--) {

            char ch = orginal.charAt(i);



         result =result+Character.toString(ch);

        }
        System.out.println(result);
    }


}
