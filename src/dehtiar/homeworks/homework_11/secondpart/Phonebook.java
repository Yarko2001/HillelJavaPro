package dehtiar.homeworks.homework_11.secondpart;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

  private static final List<WritingInfo> writingList = new ArrayList<>();

  public static void add(WritingInfo writing) {
    writingList.add(writing);
  }

  public static String find(String name) {

    for (WritingInfo personInfo : writingList) {
      if (name.equals(personInfo.getName())) {
        return personInfo.toString();
      }
    }
    return null;
  }

  public static String findAll(String name) {

    StringBuilder findAll = new StringBuilder();

    for (WritingInfo personInfo : writingList) {
      if (name.equals(personInfo.getName())) {
        findAll.append(personInfo).append("\n");
      }
    }

    if (findAll.toString().isEmpty()) {
      return null;
    }

    return findAll.toString();
  }
}
