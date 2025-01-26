package numbers;

import java.util.ArrayList;

/**
 * <h1>Numbers.</h1>
 *
 * <p>The purpose of the Numbers class is to create an object with a list of numbers.
 *    The list of numbers is of type Integer.</p>
 *
 * <p>It has 2 methods to add a number to the list and to get a number from the list.</p>
 *
 * @author erikt
 * @version 0.0.1
 */

public class NumberList {

  private final ArrayList<Number> list; //List of numbers

  /**
   * <h3>Numbers.</h3>
   * <p>Constructor for the Numbers class.</p>
   * <p>It initializes the numbers list.</p>
   */
  public NumberList() {
    this.list = new ArrayList<>();
  }

  /**
   * <h3>addNumber.</h3>
   * <p>The method adds a number to the list of numbers.</p>
   * @param number the number to be added to the list.
   */
  public void addNumber(Number number) {
    list.add(number);
  }

  /**
   * <h3>getNumber.</h3>
   * <p>The method gets a number from the list of numbers.</p>
   * @param index the index of the number to be retrieved.
   * @return the number at the specified index.
   */
  public Integer getNumber(int index) {
    return list.get(index).getNumber();
  }
}
