package pl.agh.edu.dp.labirynth.factories;

import pl.agh.edu.dp.labirynth.components.BombedRoom;
import pl.agh.edu.dp.labirynth.components.BombedWall;
import pl.agh.edu.dp.labirynth.components.Room;
import pl.agh.edu.dp.labirynth.components.Wall;

public class BombedMazeFactory extends MazeFactory{
    private static BombedMazeFactory instance;
    private BombedMazeFactory(){
    };

    public static BombedMazeFactory getInstance(){
        if (instance == null){
            instance = new BombedMazeFactory();
        }
        return instance;
    }
    @Override
    public Room createRoom(int roomNumber) {
        return new BombedRoom(roomNumber);
    }

    @Override
    public Wall createWall() {
        return new BombedWall();
    }
}
