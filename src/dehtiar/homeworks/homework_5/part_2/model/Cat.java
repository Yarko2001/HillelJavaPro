package dehtiar.homeworks.homework_5.part_2.model;

public class Cat extends Participant {

    public static final String OBJECT_CLASS = "Cat";
    public static final String SUCCESSFUL_RUN_RESULT = " ran the distance successfully :";
    public static final String UNSUCCESSFUL_RUN_RESULT = " couldn't reach the finish.";
    public static final String SUCCESSFUL_JUMP_RESULT = " did it.It's not an obstacle for him :";
    public static final String UNSUCCESSFUL_JUMP_RESULT = " couldn't jump so high.";

    public Cat(String name, int maxDistance, double maxHeight) {
        super(name, maxDistance, maxHeight);
        super.info = OBJECT_CLASS + " named " + name;
        super.successfulRunResult = SUCCESSFUL_RUN_RESULT;
        super.unsuccessfulRunResult = name + UNSUCCESSFUL_RUN_RESULT;
        super.successfulJumpResult = SUCCESSFUL_JUMP_RESULT;
        super.unsuccessfulJumpResult = name + UNSUCCESSFUL_JUMP_RESULT;
    }
}
