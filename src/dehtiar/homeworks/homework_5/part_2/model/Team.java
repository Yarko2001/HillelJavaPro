package dehtiar.homeworks.homework_5.part_2.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    private String[] arr;
    private ArrayList<Participant> team;
    private String teamName;

    public Team(String teamName) {
        this.team = new ArrayList<Participant>();
        this.teamName = teamName;
    }

    public void addParticipant(Participant participant) {
        team.add(participant);
    }

    public void getTeamInfo() {
        arr = new String[team.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = team.get(i).getInfo();
        }
        System.out.println("The team " + "'" + teamName + "'" + " consists of :" + Arrays.toString(arr));
    }

    public void startCompetition(ArrayList<Obstacle> course) {
        System.out.println("Competition starts !");
        for (Obstacle obstacle : course) {
            for (int i = 0; i < arr.length; i++) {
                if (team.get(i).getCondition()) {
                    System.out.println(team.get(i).getRunResult(obstacle.getThreadMillLength()));
                }
                if (team.get(i).getCondition()) {
                    System.out.println(team.get(i).getJumpResult(obstacle.getWallHeight()));
                }
            }
        }
    }

    public void getWinner() {
        for (Participant participant : team) {
            if (participant.getCondition()) {
                System.out.println("The best teammate is " + participant.info + " !!! " + "from " + teamName);
            }
        }
    }
}
