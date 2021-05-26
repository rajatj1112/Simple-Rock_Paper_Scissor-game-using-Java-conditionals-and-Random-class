package com.company;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int max_upperbound = 3, comp_score = 0, player_score = 0;
        System.out.print("Enter how many times you want to battle? : ");
        int n = sc.nextInt();
        int i = 1;
        while(n>0)
        {
            System.out.println("***********************************************");
            System.out.println("BATTLE "+i+" : ");
            System.out.println();
            System.out.println();
            System.out.println("Enter '1' for ROCK");
            System.out.println("Enter '2' for PAPER");
            System.out.println("Enter '3' for SCISSOR");
            System.out.println();
            System.out.print("Enter your choice : ");
            byte ch = sc.nextByte();
            System.out.println();
            System.out.println("***********************************************");
            System.out.println();

            switch(ch){
                case 1 :
                    System.out.println("Let's BATTLE : ");
                    System.out.println("You selected 'ROCK'\n");
                    System.out.println("Computer's turn -");
                    int rand1 = rand.nextInt(max_upperbound+1);

                    if(rand1!=0)
                    {
                        if(rand1 == 1) {
                            System.out.println("Computer selected ROCK");
                            System.out.println("It's a tie!");
                        }
                        if(rand1 == 2) {
                            System.out.println("Computer selected PAPER");
                            System.out.println("OOPS...Computer wins!");
                            comp_score++;
                        }
                        if(rand1 == 3) {
                            System.out.println("Computer selected SCISSOR");
                            System.out.println("You won....Congo!");
                            player_score++;
                        }
                    }

                    break;

                case 2 :
                    System.out.println("Let's BATTLE : ");
                    System.out.println("You selected 'PAPER'\n");
                    System.out.println("Computer's turn -");
                    int rand2 = rand.nextInt(max_upperbound+1);

                    if(rand2!=0)
                    {
                        if(rand2 == 1) {
                            System.out.println("Computer selected ROCK");
                            System.out.println("You won....Congo!");
                            player_score++;
                        }
                        if(rand2 == 2) {
                            System.out.println("Computer selected PAPER");
                            System.out.println("It's a tie!");
                        }
                        if(rand2 == 3) {
                            System.out.println("Computer selected SCISSOR");
                            System.out.println("OOPS...Computer wins!");
                            comp_score++;
                        }
                    }

                    break;

                case 3 :
                    System.out.println("Let's BATTLE : ");
                    System.out.println("You selected 'SCISSOR'\n");
                    System.out.println("Computer's turn -");
                    int rand3 = rand.nextInt(max_upperbound+1);

                    if(rand3!=0)
                    {
                        if(rand3 == 1) {
                            System.out.println("Computer selected ROCK");
                            System.out.println("OOPS...Computer wins!");
                            comp_score++;
                        }
                        if(rand3 == 2) {
                            System.out.println("Computer selected PAPER");
                            System.out.println("You won....Congo!");
                            player_score++;
                        }
                        if(rand3 == 3) {
                            System.out.println("Computer selected SCISSOR");
                            System.out.println("It's a tie!");
                        }
                    }

                    break;

                default:
                    System.out.println("Not selected a correct value!!");
                    break;
            }
            n--;
            i++;
        }
        System.out.println("\nThe final score :");
        System.out.println();
        System.out.println("-Your Score-\t-Computer's Score-\n");
        System.out.println("\t"+player_score+"\t\t\t\t\t"+comp_score);

        System.out.println("\n-----Thank you for playing the game-----");

    }

}
