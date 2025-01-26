package numbers;

public class Number {

  private Integer value; //Number

  /**
   * <h3>Number.</h3>
   * <p>Constructor for the Number class.</p>
   * <p>It initializes the number.</p>
   * @param value the number to be initialized.
   */

  public Number(Integer value) {
    setNumber(value);
  }

  /**
   *<h3>setNumber.</h3>
   * <p>Sets the value of the number object.</p>
   * @param number the value of the object.
   */
  public void setNumber(Integer number) {
    this.value = number;
  }

  /**
   * <h3>getNumber.</h3>
   * @return the value of the number object.
   */
  public Integer getNumber() {
    return value;
  }
}
