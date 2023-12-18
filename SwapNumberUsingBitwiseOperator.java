public class SwapNumberUsingBitwiseOperator {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        System.out.println("Before swapping a : " + a + " B :" + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;


        System.out.println("after swapping a : " + a + " B :" + b);
    }
}
