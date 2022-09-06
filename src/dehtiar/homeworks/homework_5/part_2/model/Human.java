package dehtiar.homeworks.homework_5.part_2.model;

public class Human extends Participant {

    public static final String OBJECT_CLASS = "Person";
    public static final String SUCCESSFUL_RUN_RESULT = " ran the distance successfully :";
    public static final String UNSUCCESSFUL_RUN_RESULT = " couldn't do it.It's unsuccessful today for you,and we must say goodbye.";
    public static final String SUCCESSFUL_JUMP_RESULT = " overcame the wall :";
    public static final String UNSUCCESSFUL_JUMP_RESULT = " is just hanging on the wall and can't continue the competition.";

    public Human(String name, int maxDistance, double maxHeight) {
        super(name, maxDistance, maxHeight);
        super.info = OBJECT_CLASS + " named " + name;
        super.successfulRunResult = SUCCESSFUL_RUN_RESULT;
        super.unsuccessfulRunResult = name + UNSUCCESSFUL_RUN_RESULT;
        super.successfulJumpResult = SUCCESSFUL_JUMP_RESULT;
        super.unsuccessfulJumpResult = name + UNSUCCESSFUL_JUMP_RESULT;
    }
}
