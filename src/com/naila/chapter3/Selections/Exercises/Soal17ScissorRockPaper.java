package com.naila.chapter3.Selections.Exercises;

import java.util.Scanner;

public class Soal17ScissorRockPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computer = (int)(Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();

        System.out.print("The computer is ");
        switch (computer)
        {
            case 0: System.out.print("scissor."); break;
            case 1: System.out.print("rock."); break;
            case 2: System.out.print("paper.");
        }

        System.out.print(" You are ");
        switch (user)
        {
            case 0: System.out.print("scissor"); break;
            case 1: System.out.print("rock"); break;
            case 2: System.out.print("paper ");
        }

        if (computer == user)
            System.out.println(" too. It is a draw");
        else
        {
            boolean win = (user == 0 && computer == 2) ||
                    (user == 1 && computer == 0) ||
                    (user == 2 && computer == 1);
            if (win)
                System.out.println(". You won");
            else
                System.out.println(". You lose");
        }
    }
}

/*
(Game: scissor, rock, paper) Write a program that plays the popular scissor–
rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
a paper can wrap a rock.) The program randomly generates a number 0, 1, or
2 representing scissor, rock, and paper. The program prompts the user to enter
a number 0, 1, or 2 and displays a message indicating whether the user or the
computer wins, loses, or draws. Here are sample runs:

scissor (0), rock (1), paper (2): 1
The computer is scissor. You are rock. You won
scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw
 */