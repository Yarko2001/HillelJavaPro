package dehtiar.homeworks.homework_5.part_2;

import dehtiar.homeworks.homework_5.part_2.model.*;

public class ProgramStart {
    public static void main(String[] args) {
        Team team1 = new Team("Dark Hearts");
        team1.addParticipant(new Human("Steve", 400, 0.9));
        team1.addParticipant(new Robot("Chaplie", 2050, 2.2));
        team1.addParticipant(new Cat("Tom", 300, 1.0));

        Team team2 = new Team("Sum41");
        team2.addParticipant(new Human("Yaroslav", 800, 1.0));
        team2.addParticipant(new Robot("Terminator", 3000, 2.5));
        team2.addParticipant(new Cat("Willy", 500, 0.9));

        ObstacleObject course1 = new ObstacleObject();
        course1.obstacleAdd(new Obstacle(new Wall(0.2), new ThreadMill(100)));
        course1.obstacleAdd(new Obstacle(new Wall(0.8), new ThreadMill(700)));
        course1.obstacleAdd(new Obstacle(new Wall(2.0), new ThreadMill(2000)));

        team1.getTeamInfo();
        team1.startCompetition(course1.getObstacles());

        team2.getTeamInfo();
        team2.startCompetition(course1.getObstacles());

        team1.getWinner();
        team2.getWinner();
    }
}
