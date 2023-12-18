public class Fibonacci_Series {
    public static void main(String[] args) {

    int n =10;
    printFibonacciSeries(n);

    }
    public static void printFibonacciSeries(int n){
        int a = 0,b=1;

        System.out.println("Fibonacci series up to "+n);

        for (int i=0;i<n;i++){
            System.out.print(a+" ---> ");

            int temp = a+b;
            a = b;
            b = temp;
        }
    }
}


