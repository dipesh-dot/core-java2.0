public class FrequencyOfElement {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 5, 4, 6, 7, 7, 8,7, 8, 8, 8};
        int[] b = new int[a.length];


        for (int i = 0; i < a.length; i++) {

            int element = a[i];
            if (element == -1) {
                continue;
            }

            int frequency = 1;
            for (int j = i + 1; j < a.length; j++) {

                if (element == a[j]) {
                    frequency++;

                    a[j] = -1;
                }

            }
            System.out.println("Element: " + element + ", Frequency: " + frequency);
        }
    }
}