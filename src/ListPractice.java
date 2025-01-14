import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.jar.Attributes.Name;

public class ListPractice {

  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> names = new ArrayList<String>();

    // Add 3 elements to the list (OK to do one-by-one)
    names.add("Shiroko");
    names.add("Hoshino");
    names.add("Serika");

    // Print the element at index 1
    System.out.println(names.get(1));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    names.set(1, "Ayane");

    // Insert a new element at index 0 (the length of the list will change)
    names.add(0, "Nonomi");

    // Check whether the list contains a certain string
    String search = "Shiroko";
    System.out.println(names.contains(search));

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < names.size(); i++) {
      System.out.println(i + " " + names.get(i));
    }

    // Sort the list using the Collections library
    Collections.sort(names);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String name : names) {
      System.out.println();
      System.out.println(name);
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to
     * iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need
     * the
     * index values a for-each loop is cleaner.
     */
  }
}