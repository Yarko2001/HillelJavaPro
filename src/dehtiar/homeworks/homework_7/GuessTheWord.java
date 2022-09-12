package dehtiar.homeworks.homework_7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String guess = null;
        String guessWord = words[random.nextInt(words.length)];
        System.out.println(Arrays.toString(words));
        do {
            System.out.println("Guess the guessWord :");
            guess = scanner.next();
            for (int i = 0; i < 15; i++) {
                if (i < guessWord.length() && i < guess.length() && guessWord.charAt(i) == guess.charAt(i)) {
                    System.out.print(guessWord.charAt(i));
                } else {
                    System.out.print((guessWord.equals(guess)) ? "" : "#");
                }
                System.out.println();
            }
        } while (!guessWord.equals(guess));
        System.out.println("Congratulations !!!");
    }

}
