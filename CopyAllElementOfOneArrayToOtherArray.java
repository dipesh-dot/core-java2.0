import java.util.Arrays;

public class CopyAllElementOfOneArrayToOtherArray {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};


        int[]b=new int[a.length];

        for (int i =0; i< a.length;i++){
            b[i]=a[i];
        }
        System.out.println("Array b:"+ Arrays.toString(b));
    }
}
