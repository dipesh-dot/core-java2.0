public class GreatestCommonFactor {

    public static void main(String[] args) {
        int x = 12;
        int y = 18;
        int HighestFactor = 0;
        for (int i = 2; i <= x; i++) {

            if (x % i == 0 && y % i == 0) {
                HighestFactor = i;

            }
        }
        System.out.println(HighestFactor);
    }
}
