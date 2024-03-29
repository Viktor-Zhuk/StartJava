package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(sc.nextLine());
        System.out.print("Введите имя второго игрока: "); 
        Player playerTwo = new Player(sc.nextLine());
        System.out.println("У каждого игрока по 10 попыток");

        String answer = "yes";
        while (!answer.equals("no")) { 
            if (answer.equals("yes")) {
                GuessNumber game = new GuessNumber(playerOne, playerTwo);
                game.start();
            }

            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = sc.nextLine();
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Введите корректный ответ.");
            }
        }
    }
}