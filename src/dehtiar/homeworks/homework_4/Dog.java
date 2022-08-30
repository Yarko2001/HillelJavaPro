package dehtiar.homeworks.homework_4;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int lengthObstacle) {
        if (lengthObstacle < 500) {
            System.out.println("Dog " + name + " ran " + lengthObstacle + " metres.");
        } else {
            System.out.println("An unbearable distance for " + name);
        }
    }

    @Override
    public void swim(int lengthObstacle) {
        if (lengthObstacle < 10) {
            System.out.println("Dog " + name + " swam " + lengthObstacle + " metres.");
        } else {
            System.out.println("An unbearable distance for" + name);
        }
    }
}
