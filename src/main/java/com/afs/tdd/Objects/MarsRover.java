package com.afs.tdd.Objects;

import java.util.ArrayList;
import java.util.List;

public class MarsRover {
    private int coordinateX;
    private int coordinateY;
    private String direction;
    static final List<String> directionList = new ArrayList<>();

    public MarsRover(int coordinateX, int coordinateY, String direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
        directionList.add("E");
        directionList.add("S");
        directionList.add("W");
        directionList.add("N");
    }
    public String batchControlMarsRover(String command) {
        for (int i = 0; i < command.length(); i++) {
            controlMarsRover(String.valueOf(command.charAt(i)));
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
        if (command.equals("R")) {
            direction = directionList.get((currentDirectionIndex + 1) > (directionList.size() - 1) ? 0 : directionList.indexOf(direction) + 1);
        }
        if (command.equals("L")) {
            direction = directionList.get((currentDirectionIndex - 1) < 0 ? directionList.size() - 1 : directionList.indexOf(direction) - 1);
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
