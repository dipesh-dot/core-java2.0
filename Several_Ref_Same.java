import java.util.ArrayList;
import java.util.List;

public class Several_Ref_Same {
    public static void main(String[] args) {

//
//        int i = 42;
//        System.out.println("i  :  "+i);
//        int j = i;
//        System.out.println("j  :  "+j);
//
//        i = 40;
//        System.out.println("i and j are ; "+i+ " " +j);
//
//        j=50;
//        System.out.println("i and j are ; "+i+ " " +j);



        //second case

        // Creating a new ArrayList object
        ArrayList<Integer> firstList = new ArrayList<>(20);

        firstList.add(20);
        // Assigning the same object to another variable
        List<Integer> secondList = firstList;

        // Adding an element to the first list
        firstList.add(42);

        // Accessing the same element through the second list
        System.out.println(secondList.get(0)); // Outputs 42
        System.out.println(firstList.get(0));
        System.out.println(secondList.get(1));


    }
}
