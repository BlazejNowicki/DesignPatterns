package pl.agh.edu.dp.labirynth.builders;

import pl.agh.edu.dp.labirynth.components.Maze;
import pl.agh.edu.dp.labirynth.components.Room;
import pl.agh.edu.dp.labirynth.enums.Direction;

public interface MazeBuilder {
    void addRoom(Room room);
    void setCommonWall(Room room1, Room room2, Direction room1Direction);
    void addDoorBetween(Room room1, Room room2) throws Exception;

    Maze getMaze();
}
