package dehtiar.homeworks.homework_5.part_2.services;

public interface Motion {
    boolean jump(double height, double maxHeight);

    boolean run(int distance, int maxDistance);
}
