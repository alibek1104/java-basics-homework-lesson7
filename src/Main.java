public class Main {

    // 1.

    static int getMinOfThreeNumbers(int x, int y, int z) {
        int min = x;
        if (x < min) {
            x = min;
        }
        if (y < min) {
            y = min;
        }
        if (z < min) {
            z = min;
        }
        return min;

    }

    // 2.
    static double averageNum(int a, int b, int c) {

        double[] array = {a, b, c};
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        return average;

    }

    // 3.

//    static String getVowel() {
//
//        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
//        char[] DarTech123 = {'d', 'a', 'r', 't', 'e', 'c', 'h', '1', '2', '3'};
//        String get
//
//        if (vowel == DarTech123) {
//            return
//        }
//
//
//    }

public static void main(String[] args) {

        // 1.
    int x = 25;
    int y = 37;
    int z = 29;

    int min = getMinOfThreeNumbers(x, y, z);
    System.out.println(min);

    // 2.
    int a = 25;
    int b = 45;
    int c = 65;

    double average1 = averageNum(a,b,c);
    System.out.println(average1);

    // 3.

    String checkVowel = "DarTech123";

}
}