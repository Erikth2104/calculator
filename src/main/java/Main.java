import numbers.NumberList;
import numbers.Number;
import operations.Operations;

/**
 * <h1>Main.</h1>
 */

public class Main {

  /**
   * <h3>Main.</h3>
   * <p>Main method for the Main class.</p>
   * <p>It creates a NumberList object, two Number objects, adds them to the list, creates an Operations object, and prints the result of adding the two numbers.</p>
   * @param args the command line arguments.
   */

  public static void main(String[] args) {
    NumberList list = new NumberList();
    Number number1 = new Number(10);
    Number number2 = new Number(5);
    list.addNumber(number1);
    list.addNumber(number2);
    Operations operations = new Operations();
    System.out.println(operations.add(list.getNumber(0), list.getNumber(1)));
  }
}
