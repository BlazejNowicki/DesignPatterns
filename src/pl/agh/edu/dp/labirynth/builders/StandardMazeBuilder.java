package pl.agh.edu.dp.labirynth.builders;

import pl.agh.edu.dp.labirynth.components.Door;
import pl.agh.edu.dp.labirynth.components.Maze;
import pl.agh.edu.dp.labirynth.components.Room;
import pl.agh.edu.dp.labirynth.components.Wall;
import pl.agh.edu.dp.labirynth.enums.Direction;

import java.util.Arrays;

public class StandardMazeBuilder implements MazeBuilder{
    private final Maze currentMaze = new Maze();

    @Override
    public void addRoom(Room room) {
        Arrays.stream(Direction.values())
                .forEach(direction -> room.setSide(direction, mazeFactory.createWall()));
        currentMaze.addRoom(room);
    }

    @Override
    public void setCommonWall(Room room1, Room room2, Direction room1Direction){
        room1.setSide(room1Direction, room2);
        room2.setSide(room1Direction.getOpposite(), room1);
    }

    @Override
    public void addDoorBetween(Room room1, Room room2) throws Exception{
        Direction room1Direction = commonWallDirection(room1, room2);
        if (room1Direction == null) {
            throw new Exception("Rooms don't have a common wall");
        }
        // Create the door on the common wall between the rooms
//        Door door = mazeFactory.createDoorBetween(room1, room2);
        Door door = new Door(room1, room2);
        room1.setSide(room1Direction, door);
        room2.setSide(room1Direction.getOpposite(), door);
    }

    @Override
    public Maze getMaze() {
        return this.currentMaze;
    }

    private Direction commonWallDirection(Room room1, Room room2) {
        for (Direction direction: Direction.values()) {
            if (room1.getSide(direction).equals(room2) && room2.getSide(direction.getOpposite()).equals(room1)) {
                return direction;
            }
        }
        return null;
    }
}
