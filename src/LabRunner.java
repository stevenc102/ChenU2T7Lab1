import java.util.Scanner;
public class LabRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter in a word: ");
        String word = scan.nextLine();
        int wordLength = word.length();
        String firstHalfOfWord = word.substring(0, (word.length() / 2));
        System.out.println("Your word is " + wordLength + "characters long.");
        System.out.println("The first half of your word is ")
    }
}
