public class DvideStringInNEqualPart {
    public static void main(String[] args) {

        String str = "aaabbbccc";

        int N = 3;

        for (int i = 0; i < str.length(); i++) {

            for (int j=i;j<=3;j++){
                str.substring(i,j);
            }

        }
    }
}
