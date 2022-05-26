package pl.agh.edu.dp.labirynth.factories;

import pl.agh.edu.dp.labirynth.components.Door;
import pl.agh.edu.dp.labirynth.components.Room;
import pl.agh.edu.dp.labirynth.components.Wall;

public class MazeFactory {
    public Room createRoom(int roomNumber){
        return new Room(roomNumber);
    }

    public Wall createWall(){
        return new Wall();
    }

    public Door createDoor(Room room1, Room room2){
        return new Door(room1, room2);
    }
}
