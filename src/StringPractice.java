import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "Swing";

    // Find the length of the string
    System.out.println(word.length());

    // Concatenate (add) two strings together and reassign the result
    String word2 = word + "Forward";

    // Find the value of the character at index 3
    System.out.println(word2.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string
    // have "abc" in it?)
    System.out.println(word2.contains("abc"));

    // Iterate over the characters of the string, printing each one on a separate
    // line
    for (int i = 0; i < word2.length(); i++) {
      System.out.println(word2.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> wordList = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    wordList.add(word);
    wordList.add("Forward");
    wordList.add("Shiroko");

    // Join all of the strings in the list together into a single string separated
    // by commas
    // Use a built-in method to achieve this instead of using a loop
    System.out.println(wordList.toString());

    // Check whether two strings are equal
    System.out.println(word.equals(word2));

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
