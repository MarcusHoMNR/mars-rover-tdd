package com.afs.tdd.Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int coordinateX;
    private int coordinateY;
    private String direction;
    static final List<String> directionList = new ArrayList<>(Arrays.asList("E", "S", "W", "N"));

    public MarsRover(int coordinateX, int coordinateY, String direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public String batchControlMarsRover(String commands) {
        for (char command : commands.toCharArray()) {
            controlMarsRover(String.valueOf(command));
        }

        return String.format("%d %d %s", coordinateX, coordinateY, direction);
    }

    private void controlMarsRover(String command) {
        if (command.equals("M")) {
            moveMarsRover();
        } else {
            rotateMarsRover(command);
        }
    }

    private void rotateMarsRover(String command) {
        int currentDirectionIndex = directionList.indexOf(direction);
        Boolean isIndexOutOfBound = null;
        int newDirectionIndex = -1;

        if (command.equals("R")) {
            isIndexOutOfBound = (currentDirectionIndex + 1) > (directionList.size() - 1);
            newDirectionIndex = isIndexOutOfBound ? 0 : currentDirectionIndex + 1;
        }
        if (command.equals("L")) {
            isIndexOutOfBound = (currentDirectionIndex - 1) < 0;
            newDirectionIndex = isIndexOutOfBound ? directionList.size() - 1 : currentDirectionIndex - 1;
        }

        if (isIndexOutOfBound != null && newDirectionIndex >= 0) {
            direction = directionList.get(newDirectionIndex);
        }
    }

    private void moveMarsRover() {
        switch (direction) {
            case "E":
                coordinateX++;
                break;
            case "S":
                coordinateY--;
                break;
            case "W":
                coordinateX--;
                break;
            case "N":
                coordinateY++;
                break;
            default:
                break;
        }
    }
}
