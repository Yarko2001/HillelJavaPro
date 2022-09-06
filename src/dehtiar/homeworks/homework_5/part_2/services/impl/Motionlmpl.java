package dehtiar.homeworks.homework_5.part_2.services.impl;

import dehtiar.homeworks.homework_5.part_2.services.Motion;

public class Motionlmpl implements Motion {
    @Override
    public boolean jump(double height, double maxHeight) {
        return height < maxHeight;
    }

    @Override
    public boolean run(int distance, int maxDistance) {
        return distance < maxDistance;
    }
}
