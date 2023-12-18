public class MaxAndMinFrequencyOfCharInStr {
    public static void main(String[] args) {
        String str = "aaaaaabbbbaaacccyyyzzzmn";

        char maxChar = ' ';
        int maxFrequency = 0;


        char minChar=' ';
        int minFrequency=10;


        for (char ch = 'a'; ch <= 'z'; ch++) {

            int counter = 0;

            for (int i = 0; i < str.length(); i++) {

            if (ch==str.charAt(i)){
                counter++;
            }

            }
            if(counter!=0){
                System.out.println("character :  "+ch +"     counter : "+counter);

            if (counter>maxFrequency){
                maxFrequency=counter;
                maxChar = ch;
            }

            if(counter<minFrequency){
                minFrequency=counter;
                minChar =ch;
            }


            if (counter >1){
                System.out.println(" duclicate char "+ ch);
            }

            }


        }

        System.out.println("maxChar : "+maxChar +"    frequency : "+maxFrequency);
        System.out.println("minChar : "+minChar +"    frequency : "+minFrequency);

    }

}



