import java.util.Arrays;

public class AllSubsetOfString {
    public static void main(String[] args) {


        String s = "FUN";
        int len = s.length();
        int size = (len*(len+1))/2;

        int temp =0;
        String arr[] = new String[size];

        for (int i=0;i<len;i++){

            for (int j=i;j<len;j++){
                arr[temp]=s.substring(i,j+1);
                temp++;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
