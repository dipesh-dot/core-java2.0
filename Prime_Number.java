public class Prime_Number {
    public static void main(String[] args) {

        int limits = 20;
printPrimeNumber(limits);
    }
    public static void printPrimeNumber(int limits){

        boolean result = true;
        for (int i=1;i<limits;i++){
            for (int j =1; j<i;j++){
                if ((i!=j) && (j!=1) && (i%j == 0)){
                    result = false;
                    break;
                }
            }

            if(i!=1&& i!=2 && result)
                System.out.println(i);
            result = true;
        }
    }
}
