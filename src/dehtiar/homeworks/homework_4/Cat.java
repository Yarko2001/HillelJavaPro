package dehtiar.homeworks.homework_4;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int lengthObstacle) {
        if (lengthObstacle < 200) {
            System.out.println("Cat " + name + " ran " + lengthObstacle + " metres.");
        } else {
            System.out.println("An unbearable distance for " + name);
        }
    }

    @Override
    public void swim(int lengthObstacle) {
        System.out.println("Cats don't swim.");
    }
}
