import java.util.Arrays;

public class ThirdLargestNumber {
    public static void main(String[] args) {


        int[] a = {13,10,21,9,3,2,7,5,12};

        int indexOfThirdLargestmean = a.length-1-2;
        int indexOfSecondSmallest = 1;

        for (int i=0; i<a.length; i++){



            for (int j=0;j<a.length-i-1;j++){

                if (a[j]>a[j+1]){
                    swap(a, j, j + 1);
                }

            }
        }
        System.out.println(Arrays.toString(a));

       int targetElement = a[indexOfThirdLargestmean];
        System.out.println(targetElement);

        System.out.println(a[indexOfSecondSmallest]);
    }
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
