package dehtiar.homeworks.homework_5.part_2.services.impl;

import dehtiar.homeworks.homework_5.part_2.services.Actionable;

public class Motionlmpl implements Actionable {
    @Override
    public boolean jump(double height, double maxHeight) {
        return height < maxHeight;
    }

    @Override
    public boolean run(int distance, int maxDistance) {
        return distance < maxDistance;
    }
}
