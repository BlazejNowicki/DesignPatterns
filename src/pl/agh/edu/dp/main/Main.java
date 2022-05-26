package pl.agh.edu.dp.main;

import pl.agh.edu.dp.labirynth.*;
import pl.agh.edu.dp.labirynth.builders.CountingMazeBuilder;
import pl.agh.edu.dp.labirynth.builders.StandardMazeBuilder;
import pl.agh.edu.dp.labirynth.components.Maze;
import pl.agh.edu.dp.labirynth.factories.BombedMazeFactory;
import pl.agh.edu.dp.labirynth.factories.EnchantedMazeFactory;
import pl.agh.edu.dp.labirynth.factories.MazeFactory;

public class Main {

    public static void main(String[] args) {
        MazeFactory standardFactory = new MazeFactory();

        MazeGame mazeGame = new MazeGame();
        StandardMazeBuilder standardBuilder = new StandardMazeBuilder(standardFactory);
        Maze maze = mazeGame.createMaze(standardBuilder, standardFactory);
        System.out.println(maze.getRoomNumbers());

        MazeGame countingMazeGame = new MazeGame();
        CountingMazeBuilder countingBuilder = new CountingMazeBuilder();
        countingMazeGame.createMaze(countingBuilder);
        System.out.println(countingBuilder.getCounts());

        MazeGame enchantedGame = new MazeGame();
        EnchantedMazeFactory enchantedFactory = new EnchantedMazeFactory();
        StandardMazeBuilder standardEnchantedBuilder = new StandardMazeBuilder(enchantedFactory);
        Maze enchantedMaze = enchantedGame.createMaze(standardEnchantedBuilder, enchantedFactory);
        System.out.println(enchantedMaze.getRoomNumbers());

        MazeGame bombedGame = new MazeGame();
        BombedMazeFactory bombedFactory = new BombedMazeFactory();
        StandardMazeBuilder standardBombedBuilder = new StandardMazeBuilder(bombedFactory);
        Maze bombedMaze = bombedGame.createMaze(standardBombedBuilder, bombedFactory);
        System.out.println(bombedMaze.getRoomNumbers());
    }
}



