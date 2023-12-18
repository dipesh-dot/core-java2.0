import java.util.Arrays;

public class PrintDuplicateElement {
    public static void main(String[] args) {


        int a[] = {1,2,3,4,3,3,4,4,5,5};


        for (int i=0;i<a.length;i++){
            int element = a[i];
            int frequency = 1;
            for (int j=i+1;j< a.length;j++){
                if (element==a[j]){
                    frequency++;
                    a[j] = -1;
                }


            }
            if (frequency>1 && element!=-1){
                System.out.println(element);
            }
        }

    }
}
