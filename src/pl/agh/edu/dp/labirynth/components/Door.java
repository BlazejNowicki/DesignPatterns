package pl.agh.edu.dp.labirynth.components;

import pl.agh.edu.dp.labirynth.MapSite;

public class Door extends MapSite {
    private final Room room1;
    private final Room room2;

    public Door(Room r1, Room r2) {
        this.room1 = r1;
        this.room2 = r2;
    }


    @Override
    public void Enter() {
    }

    public Room getRoom1() {
        return room1;
    }

    public Room getRoom2() {
        return room2;
    }
}
