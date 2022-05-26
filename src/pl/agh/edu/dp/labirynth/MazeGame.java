package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.labirynth.builders.MazeBuilder;
import pl.agh.edu.dp.labirynth.components.Door;
import pl.agh.edu.dp.labirynth.components.Maze;
import pl.agh.edu.dp.labirynth.components.Room;
import pl.agh.edu.dp.labirynth.components.Wall;
import pl.agh.edu.dp.labirynth.enums.Direction;

public class MazeGame {
    public Maze createMaze(MazeBuilder builder){
        Room r1 = new Room(1);
        Room r2 = new Room(2);

        builder.addRoom(r1);
        builder.addRoom(r2);
        builder.addRoom(r3);

        builder.setCommonWall(r1, r2, Direction.North);
        builder.setCommonWall(r2, r3, Direction.East);
        try {
            builder.addDoorBetween(r1, r2);
            builder.addDoorBetween(r2, r3);
        } catch (Exception e) {
            System.out.println(e);
        }

        maze = builder.getMaze();
        return maze;
    }

    public void move(Direction direction) {
        if (location.getSide(direction) instanceof Door) {
            Door door = (Door) location.getSide(direction);
            Room newLocation = door.getRoom1().hashCode() == location.hashCode() ? door.getRoom2() : door.getRoom1();
            System.out.println("Changed position form room " + location.getRoomNumber() + " to " + newLocation.getRoomNumber());
            location = newLocation;
        } else {
            System.out.println("There is a wall in the way");
        }
    }
}
