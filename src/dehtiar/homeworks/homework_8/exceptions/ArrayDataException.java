package dehtiar.homeworks.homework_8.exceptions;

public class ArrayDataException extends ParentException {

  public ArrayDataException(int row, int col) {
    super(String.format("Incorrect data in  [%d, %d]\n", row, col));
  }
}
