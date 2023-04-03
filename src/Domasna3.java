import java.util.Random;
import java.util.Scanner;

public class Domasna3 {
    public static void main(String[] args) {
        Random random = new Random();
        char letter = (char) (random.nextInt(26) + 'A');
        Scanner scanner = new Scanner(System.in);
        int numTries = 0;

        System.out.println("Napishete bukva pomegju A i Z ");

        while (true) {
            char guess = scanner.next().toUpperCase().charAt(0);
            numTries++;

            if (guess == letter) {
                System.out.println("Cestito, ja pogodivte bukvata  " + letter + " vo " + numTries + " pogodoci!");
                break;
            } else {
                System.out.println("Pogresna bukva, obidete se povtorno.");
            }
        }
    }
}