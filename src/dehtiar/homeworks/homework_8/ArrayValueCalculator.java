package dehtiar.homeworks.homework_8;

import dehtiar.homeworks.homework_8.exceptions.ArrayDataException;
import dehtiar.homeworks.homework_8.exceptions.ArraySizeException;
import dehtiar.homeworks.homework_8.exceptions.ParentException;

public class ArrayValueCalculator {

  public static void main(String[] args) {
    String[][] stringArray = new String[][]{
        {"1", "2", "3", "4"},
        {"2", "3", "4", "5"},
        {"6", "7", "8", "9"},
        {"9", "8", "7", "6"}};
    try {
      System.out.println(
          "Sum of all array elements :" + ArrayValueCalculator.doCalc(stringArray) + ".\n");
    } catch (ParentException e) {
      System.out.println(e.getMessage());
    }

  }

  private static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
    int counter = 0;

    if (array.length != 4) {
      throw new ArraySizeException();
    }
    for (int i = 0; i < array.length; i++) {
      if (array[i].length != 4) {
        throw new ArraySizeException();
      }
      for (int j = 0; j < array[i].length; j++) {
        try {
          counter += Integer.parseInt(array[i][j]);
        } catch (NumberFormatException e) {
          throw new ArrayDataException(i, j);
        }
      }
    }
    return counter;
  }
}
