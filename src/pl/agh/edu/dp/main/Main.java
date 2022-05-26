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
        MazeFactory enchantedFactory1 = EnchantedMazeFactory.getInstance();

        MazeGame mazeGame = new MazeGame();
        StandardMazeBuilder standardBuilder = new StandardMazeBuilder(standardFactory);
        Maze maze = mazeGame.createMaze(standardBuilder, standardFactory);
        System.out.println(maze.getRoomNumbers());

//        MazeGame countingMazeGame = new MazeGame();
//        CountingMazeBuilder countingBuilder = new CountingMazeBuilder();
//        countingMazeGame.createMaze(countingBuilder, enchantedFactory1);
//        System.out.println(countingBuilder.getCounts());
//
//        MazeGame enchantedGame = new MazeGame();
//        EnchantedMazeFactory enchantedFactory2 = EnchantedMazeFactory.getInstance();
//        StandardMazeBuilder standardEnchantedBuilder = new StandardMazeBuilder(enchantedFactory2);
//        Maze enchantedMaze = enchantedGame.createMaze(standardEnchantedBuilder, enchantedFactory2);
//        System.out.println(enchantedMaze.getRoomNumbers());
//
//        MazeGame bombedGame = new MazeGame();
//        BombedMazeFactory bombedFactory = BombedMazeFactory.getInstance();
//        StandardMazeBuilder standardBombedBuilder = new StandardMazeBuilder(bombedFactory);
//        Maze bombedMaze = bombedGame.createMaze(standardBombedBuilder, bombedFactory);
//        System.out.println(bombedMaze.getRoomNumbers());
//
//        // 4.b
//        System.out.println("Hashcode of standardFactory1 is "
//                + enchantedFactory1.hashCode());
//        System.out.println("Hashcode of enchantedFactory2 is "
//                + enchantedFactory2.hashCode());
        mazeGame.playGame(maze);
    }
}



