import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        System.out.println("Enter 5 words:");
        for (int i = 0; i < words.length; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            words[i] = input.next();
        }

        // a. Find the longest word
        String longestWord = words[0];
        int totalCharacters = 0;

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            // b. Add up the characters
            totalCharacters += word.length();
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Total characters in all words: " + totalCharacters);

        // c. Show the words with an even number of characters
        System.out.print("Words with an even number of characters: ");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.print(word + " ");
            }
        }
        System.out.println();

        input.close();
    }
}