import java.util.Arrays;

public class SmallestAndLargest {
    public static void main(String[] args) {

        String str = " this is my house ";
        String arr[] = str.split(" ");
        System.out.println(Arrays.toString(arr));
        String MaxString = " ";
        String minString = " ";
        int Maxlength = 0;
        int minlength = 10;
        for (int i = 0; i < arr.length; i++) {
            int strlenght = arr[i].length();

            if (strlenght != 0) {
                if (Maxlength < strlenght) {

                    Maxlength = strlenght;
                    MaxString = arr[i];

                }


                if (minlength > strlenght) {

                    minlength = strlenght;
                    minString = arr[i];


                }
            }

        }
        System.out.println("max string : " + MaxString + "     max length " + Maxlength);
        System.out.println("min string : " + minString + "     min length " + minlength);

    }
}
