package dehtiar.homeworks.homework_4;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int lengthObstacle){
        System.out.println("Animal ran "+lengthObstacle+" metres");
    }
    public void swim(int lengthObstacle){
        System.out.println("Animal swam "+lengthObstacle+" metres");
    }
}
