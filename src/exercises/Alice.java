package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        String mutableFirstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Type a term to search.");
        String searchTerm = input.nextLine();
        boolean found = firstSentence.toLowerCase().contains(searchTerm.toLowerCase());
        if (found){
            System.out.println("Search term has been found first at index " + firstSentence.toLowerCase().indexOf(searchTerm.toLowerCase()) + ".");
            System.out.println("Search term is " + searchTerm.length() + " characters long.");
            String replaceString = mutableFirstSentence.toLowerCase().replace(searchTerm.toLowerCase(), "");
            System.out.println(replaceString);
        }   else {
            System.out.println("Search term has not been found.");
        }
    }
}
