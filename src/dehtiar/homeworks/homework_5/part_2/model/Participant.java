package dehtiar.homeworks.homework_5.part_2.model;

import dehtiar.homeworks.homework_5.part_2.services.Actionable;
import dehtiar.homeworks.homework_5.part_2.services.impl.Motionlmpl;

abstract class Participant {
    protected String info;
    protected int maxDistance;
    protected double maxHeight;
    protected String successfulRunResult;
    protected String unsuccessfulRunResult;
    protected String successfulJumpResult;
    protected String unsuccessfulJumpResult;
    private boolean condition;
    private Actionable motion;

    Participant(String name, int maxDistance, double maxHeight) {
        this.info = "";
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.successfulRunResult = "";
        this.unsuccessfulRunResult = "";
        this.successfulJumpResult = "";
        this.unsuccessfulJumpResult = "";
        this.condition = true;
        this.motion = new Motionlmpl();
    }

    public String getInfo() {
        return info;
    }

    public String getJumpResult(double height) {
        if (motion.jump(height, maxHeight) && condition) {
            return info + successfulJumpResult + height + " m.";
        }
        condition = false;
        return info = unsuccessfulJumpResult;
    }

    public String getRunResult(int distance) {
        if (motion.run(distance, maxDistance) && condition) {
            return info + successfulRunResult + distance + " m.";
        }
        condition = false;
        return info = unsuccessfulRunResult;
    }

    public boolean getCondition() {
        return condition;
    }
}
