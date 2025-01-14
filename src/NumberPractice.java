public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float negativeFloat = -1.5f;

    // Create an int with a positive value and assign it to a variable
    int positiveInt = 5;

    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainder = positiveInt % 3;

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    boolean even = (positiveInt % 2 == 0);
    System.out.println(even);

    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if (positiveInt % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
    // Divide the number by another number using integer division
    System.out.println(positiveInt / 4);

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example:
     * 7 / 3 = 2 when performing int division
     */

  }
}
