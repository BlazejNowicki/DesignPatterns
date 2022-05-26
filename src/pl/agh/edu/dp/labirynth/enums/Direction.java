package pl.agh.edu.dp.labirynth.enums;

public enum Direction {
    North, East, South, West;

    public Direction getOpposite() {
        return Direction.values()[(this.ordinal()+2)%4];
    }
}