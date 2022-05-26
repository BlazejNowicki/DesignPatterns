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

        builder.setCommonWall(r1, r2, Direction.North);
        try {
            builder.addDoorBetween(r1, r2);
        } catch (Exception e) {
            System.out.println(e);
        }

        return builder.getMaze();
    }
}
