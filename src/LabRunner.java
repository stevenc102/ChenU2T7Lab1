import java.util.Scanner;
public class LabRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter in a word: ");
        String word = scan.nextLine();
        int wordLength = word.length();
        double temp = (wordLength / 2.0) - 0.5;
        int secondHalf = (int) temp;


        String secondHalfOfWord = word.substring(secondHalf, wordLength);
        String firstHalfOfWord = word.substring(0, (word.length() / 2));

        System.out.println("Your word is " + wordLength + " characters long.");
        System.out.println("The first half of your word is " + firstHalfOfWord);
        System.out.println("The second half of your word is " + secondHalfOfWord);
        System.out.print("Enter second string: ");
        String word2 = scan.nextLine();
        int wordLength2 = word2.length();
        if (wordLength > wordLength2) {
            System.out.println(word + " is longer");
        } else {
            if (wordLength == wordLength2) {
                System.out.println("They are equal in length");
            } else {
                System.out.println(word2 + " is longer");
            }
        }
        if (word.compareTo(word2) > 0) {
            System.out.println(word2 + " is first alphabetically");
        } else {
            if (word.compareTo(word2) == 0) {
                System.out.println("They are the same alphabetically");
            } else {
                System.out.println(word + " is first alphabetically");
            }
        }
        if (word.indexOf(word2) > -1) {
            System.out.println(word2 + " is found in " + word + " at index " + word.indexOf(word2));
        } else {
            if (word2.indexOf(word) > -1) {
                System.out.println(word + " is found in " + word2 + " at index " + word2.indexOf(word));
            } else {
                System.out.println("Neither of the words are found in each other");
            }
        }
    }
}
