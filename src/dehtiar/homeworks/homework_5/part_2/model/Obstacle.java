package dehtiar.homeworks.homework_5.part_2.model;

public class Obstacle {
    private Wall wall;
    private ThreadMill threadMill;

    public Obstacle(Wall wall, ThreadMill threadMill) {
        this.wall = wall;
        this.threadMill = threadMill;
    }

    public int getThreadMillLength() {
        return threadMill.getLength();
    }

    public double getWallHeight() {
        return wall.getHeight();
    }
}
