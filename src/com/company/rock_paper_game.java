package com.company;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_game {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissors
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock,1 for Paper, 2 for Scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt();

        if (userInput == computerInput){
            System.out.println("Draw");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput==1){
            System.out.println("you win!");
        } else{
            System.out.println("computer win you lose ");
        }
        //System.out.println("Computer choice: " + computerInput);
        //now take input from computer
        if (computerInput == 0){
            System.out.println("Computer choice : Rock");
        }
        else if (computerInput == 1){
            System.out.println("Computer choice : Paper");
        }
        else if (computerInput == 2){
            System.out.println("Computer choice : Scissor");
        }
    }
}