package dehtiar.homeworks.homework_11.firstpart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

  public static void main(String[] args) {
    String[] wildAnimals = {"bear", "wolf", "fox", "tiger", "fox", "hare", "deer", "boar", "bear",
        "hare"};
    List<String> animals = new ArrayList<>(Arrays.asList(wildAnimals));
    String str = "bear";
    System.out.println("Number of occurrences: " + countOccurance(animals, str));

    Integer[] arrNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    System.out.println(toList(arrNum));

    List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 33, 4, 3, 4, 5, 6, 5, 33, 1));
    System.out.println("Unique numbers are: " + findUnique(numbers));

    calcOccurrence(animals);

    System.out.println(findOccurrence(animals));

  }

  private static int countOccurance(List<String> words, String str) {

    if (words == null || str == null) {
      return 0;
    }

    int count = 0;

    for (String word : words) {

      if (word == null) {
        return 0;
      }
      if (word.contains(str)) {
        count++;
      }

    }
    return count;
  }

  private static List<Number> toList(Number... arrNum) {
    if (arrNum == null) {
      return null;
    } else {
      return new ArrayList<>(Arrays.asList(arrNum));
    }
  }

  private static <T extends Number> List<T> findUnique(List<T> numList) {

    List<T> uniqueNumList = new ArrayList<>();

    for (T number : numList) {
      if (!uniqueNumList.contains(number)) {
        uniqueNumList.add(number);
      } else {
        uniqueNumList.remove(number);
      }
    }

    return uniqueNumList;
  }

  private static void calcOccurrence(List<String> words) {

    for (String word : words) {
      int count = 0;
      for (String s : words) {
        if (word.contains(s)) {
          count++;
        }
      }
      System.out.println(word + ": " + count);
    }

  }

  private static List<String> findOccurrence(List<String> words) {

    List<String> findWords = new ArrayList<>();
    List<String> countWords = new ArrayList<>();

    for (String word : words) {
      if (!findWords.contains(word)) {
        findWords.add(word);
      }
    }

    for (String findWord : findWords) {
      int count = 0;
      for (String word : words) {
        if (findWord.contains(word)) {
          count++;
        }
      }
      countWords.add("{name: \"" + findWord + "\", occurrence: " + count + "}");
    }

    return countWords;
  }

}
