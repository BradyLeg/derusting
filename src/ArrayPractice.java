public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] names = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    names[0] = "Shiroko";
    names[1] = "Serika";
    names[2] = "Hoshino";
    names[3] = "Nonomi";

    // Get the value of the array at index 2
    System.out.println(names[2]);

    // Get the length of the array
    System.out.println(names.length);

    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    for (String name : names) {
      System.out.println(name);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
