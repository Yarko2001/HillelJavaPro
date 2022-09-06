package dehtiar.homeworks.homework_5.part_2.model;

import java.util.ArrayList;

public class ObstacleObject {
    private ArrayList<Obstacle> obstacles;

    public ObstacleObject() {
        obstacles = new ArrayList<Obstacle>();
    }

    public void obstacleAdd(Obstacle obstacle) {
        obstacles.add(obstacle);
    }

    public ArrayList<Obstacle> getObstacles() {
        return obstacles;
    }
}
