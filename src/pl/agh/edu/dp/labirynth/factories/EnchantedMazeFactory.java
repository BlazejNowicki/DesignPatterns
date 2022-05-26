package pl.agh.edu.dp.labirynth.factories;

import pl.agh.edu.dp.labirynth.components.EnchantedRoom;
import pl.agh.edu.dp.labirynth.components.EnchantedWall;
import pl.agh.edu.dp.labirynth.components.Room;
import pl.agh.edu.dp.labirynth.components.Wall;

public class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Room createRoom(int roomNumber) {
        return new EnchantedRoom(roomNumber);
    }

    @Override
    public Wall createWall() {
        return new EnchantedWall();
    }
}
