import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // a. Count the words (split on spaces)
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Total number of words: " + words.length);

        // b. Find the longest word, ignoring punctuation such as "!"
        int maxLength = 0;
        for (String word : words) {
            String clean = word.replaceAll("[^A-Za-z0-9]", "");
            if (clean.length() > maxLength) {
                maxLength = clean.length();
            }
        }

        System.out.print("Longest word(s): [");
        boolean first = true;
        for (String word : words) {
            String clean = word.replaceAll("[^A-Za-z0-9]", "");
            if (clean.length() == maxLength) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(clean);
                first = false;
            }
        }
        System.out.println("]");

        // c. Reverse the whole sentence
        String reversedSentence = new StringBuilder(sentence).reverse().toString();
        System.out.println("Reversed sentence: " + reversedSentence);

        input.close();
    }
}