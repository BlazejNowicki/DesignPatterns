package pl.agh.edu.dp.labirynth.builders;

import pl.agh.edu.dp.labirynth.components.Maze;
import pl.agh.edu.dp.labirynth.components.Room;
import pl.agh.edu.dp.labirynth.enums.Direction;

public class CountingMazeBuilder implements MazeBuilder {
    private int roomsCount = 0;
    @Override
    public void addRoom(Room room) {
        roomsCount++;
    }

    @Override
    public void setCommonWall(Room room1, Room room2, Direction room1Direction) {
    }

    @Override
    public void addDoorBetween(Room room1, Room room2) {
    }

    @Override
    public Maze getMaze() {
        return null;
    }

    public int getCounts() {
        return roomsCount;
    }
}
