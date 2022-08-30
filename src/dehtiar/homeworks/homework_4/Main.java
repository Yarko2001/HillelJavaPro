package dehtiar.homeworks.homework_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        Animal dogBars = new Dog("Bars");
        dogBars.run(500);
        dogBars.swim(3);

        Animal dogHenry = new Dog("Henry");
        dogHenry.run(544);
        dogHenry.swim(4);

        Animal catWilly = new Cat("Willy");
        catWilly.run(150);
        catWilly.swim(10);

        Animal animal = new Animal("SomeAnimal");
        animal.run(30);
        animal.swim(1000);

        List<Animal> animals = new ArrayList<>();
        animals.add(dogBars);
        animals.add(catWilly);
        animals.add(animal);
        animals.add(dogHenry);
        calculateAmountOfAnimals(animals);

    }

    public static void calculateAmountOfAnimals(List<Animal> animalList) {
        Map<? extends Class<? extends Animal>, Long> animalsHashMap =
                animalList.stream().collect(groupingBy(Animal::getClass, Collectors.counting()));
        animalsHashMap.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
