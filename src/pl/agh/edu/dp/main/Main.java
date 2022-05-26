package pl.agh.edu.dp.main;

import pl.agh.edu.dp.labirynth.*;
import pl.agh.edu.dp.labirynth.builders.CountingMazeBuilder;
import pl.agh.edu.dp.labirynth.builders.StandardMazeBuilder;
import pl.agh.edu.dp.labirynth.components.Maze;

public class Main {

    public static void main(String[] args) {

        MazeGame mazeGame = new MazeGame();
        StandardMazeBuilder standardBuilder = new StandardMazeBuilder();
        Maze maze = mazeGame.createMaze(standardBuilder);
        System.out.println(maze.getRoomNumbers());

        MazeGame countingMazeGame = new MazeGame();
        CountingMazeBuilder countingBuilder = new CountingMazeBuilder();
        countingMazeGame.createMaze(countingBuilder);
        System.out.println(countingBuilder.getCounts());
    }
}



