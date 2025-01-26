package operations;

/**
 * <h1>Operations.</h1>
 * <p>Operations class for the application.</p>
 */
public class Operations {

  /**
   * <h3>Add.</h3>
   * <p>Adds two numbers.</p>
   * @param number1 the first number.
   * @param number2 the second number.
   * @return the sum of the two numbers.
   */
  public Float add(Integer number1, Integer number2) {
    return (float) (number1 + number2);
  }

  /**
   * <h3>Subtract.</h3>
   * <p>Subtracts two numbers.</p>
   * @param number1 the first number.
   * @param number2 the second number.
   * @return the difference of the two numbers.
   */
  public Float subtract(Integer number1, Integer number2) {
    return (float) (number1 - number2);
  }

  /**
   * <h3>Multiply.</h3>
   * <p>Multiplies two numbers.</p>
   * @param number1 the first number.
   * @param number2 the second number.
   * @return the product of the two numbers.
   */
  public Float multiply(Integer number1, Integer number2) {
    return (float) (number1 * number2);
  }

  /**
   * <h3>Divide.</h3>
   * <p>Divides two numbers.</p>
   * @param number1 the first number.
   * @param number2 the second number.
   * @return the quotient of the two numbers.
   */
  public double divide(Integer number1, Integer number2) {
    return ((double) number1 / number2);
  }
}
