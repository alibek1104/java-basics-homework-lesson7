import java.util.Locale;
import java.util.Scanner;

public class Main {

    // 1.

    public static int getMinOfThreeNumbers(int x, int y, int z) {
        int tempMin = Math.min(x, y);
        return Math.min(tempMin, z);
    }
//        int min = x;
//        if (x < min) {
//            x = min;
//        }
//        if (y < min) {
//            y = min;
//        }
//        if (z < min) {
//            z = min;
//        }
//        return min;
//
//    }

    // 2.
    static double getAverageNum(int a, int b, int c) {

        double[] array = {a, b, c};
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        return average;

    }

    // 3.

    public static int getVowelsCount(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;

    }

    // 4.

    public static int getWordsCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // 5.

    public static int countNumberTwo(int a) {
        int count = 0;
        String numString = Integer.toString(a);
        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i) == '2') {
                count++;
            }
        }
        return count;
    }

    // 6.
    public static boolean findVowels(String input) {
        int count = 0;
        input = input.toLowerCase();
        String vowels = "AIEEE";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                return false;
            }
        }
        return true;
    }

    // 7.

    // 8.

    public static int sumNum(String input) {
        String numString = String.valueOf(input);
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            sum += digit;
        }

        return sum;
    }



    public static void main(String[] args) {

        // 1.
//    int x = 25; // первый вариант
//    int y = 37;
//    int z = 29;
//
//    int min = getMinOfThreeNumbers(x, y, z);
//    System.out.println(min);

//    System.out.println(getMinOfThreeNumbers(25, 37, 29)); // второй вариант

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int z = scanner.nextInt();

        System.out.println(getMinOfThreeNumbers(x, y, z));

        // 2.
        int a = 25;
        int b = 45;
        int c = 65;

        System.out.println(getAverageNum(a, b, c));


        // 3.

        System.out.println(getVowelsCount("DarTech123"));

        // 4.

        System.out.println(getWordsCount(" Java is good to learn Object Oriented programming."));

        // 5.

        System.out.println(countNumberTwo(Integer.parseInt("1254212")));

        // 6.

        System.out.println(findVowels("AIEEE"));

        // 7.

        // 8.

        System.out.println(sumNum("252"));



    }
}