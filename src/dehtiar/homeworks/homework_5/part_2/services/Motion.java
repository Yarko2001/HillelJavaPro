package dehtiar.homeworks.homework_5.part_2.services;

public class Motion implements Actionable {
    @Override
    public boolean jump(double height, double maxHeight) {
        if (height < maxHeight) return true;
        return false;
    }

    @Override
    public boolean run(int distance, int maxDistance) {
        if (distance < maxDistance) return true;
        return false;
    }
}
