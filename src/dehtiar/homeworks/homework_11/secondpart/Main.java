package dehtiar.homeworks.homework_11.secondpart;

public class Main {

  public static void main(String[] args) {

    Phonebook.add(new WritingInfo("William", "+380671251855"));
    Phonebook.add(new WritingInfo("Gregory", "+380981442231"));
    Phonebook.add(new WritingInfo("Tom", "+380971237786"));
    Phonebook.add(new WritingInfo("William", "+380671445644"));
    Phonebook.add(new WritingInfo("Lucas", "+380634556744"));
    Phonebook.add(new WritingInfo("Gregory", "+38067356444"));

    System.out.println(Phonebook.find("Gregory"));
    System.out.println(Phonebook.findAll("William"));
  }

}
