public class CountTotalNumberOfPunctuationInString {
    public static void main(String[] args) {


        String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
        int count=0;
        for (int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if (c=='!'||c=='.'||c==','||c=='/'||c==';'||c=='_'||c=='-'||c=='?'||c== '\'' ||c== '\"' ||c==':'){
                count++;
            }

        }
        System.out.println(count);
    }
}
