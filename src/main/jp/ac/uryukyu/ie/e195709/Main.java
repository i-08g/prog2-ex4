package main.jp.ac.uryukyu.ie.e195709;

import java.io.File;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /*パスを入力してもらいたい
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        File file = new File(str);

        System.out.println(str);
         */

       Maze maze = new Maze();
       Player player = new Player(maze.initialPositionX, maze.initialPositionY);

       maze.display();
       player.StepLeft();
       maze.display();
       player.StepDown();
       maze.display();
       player.StepRight();
       maze.display();
    }
}