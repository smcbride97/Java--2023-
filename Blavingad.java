import java.util.Scanner;

import java.util.Random;

public class Blavingad {
    private int rounds, humanWins, computerWins;
    private Scanner sc;

    public enum BlavingadMoves {
        // Moves
        DROMSLOTT, GULLIGAST, PLUFSIG, UPPSTA, SOLSKUR;
    }
    
    public Blavingad() {
        this.rounds = 0;
        this.humanWins = 0;
        this.computerWins = 0;
        this.sc = new Scanner(System.in);
    }

    //Rules and introduction to the game
    public void displayRules() {
        System.out.println("Hello. Welcome to Blavingad. The rules are as follows:\nDromslott beats Gulligast and Plufsig\nGulligast beats Uppsta and Solskur\nUppsta beats Dromslott and Plufsig\nPlufsig beats Solskur and Gulligast\nSolskur beats Dromslott and Uppsta\n");
        System.out.println("You will be playing against the computer. If there is a tie, the computer wins the round. Choose your move wisely.");
    }

    //Play a round
    public void Play() {
        BlavingadMoves[] moves = BlavingadMoves.values();

        int move = 0;
        boolean notValid = true;
        while(notValid) {
            for (int i = 0; i < moves.length; i++)
                System.out.printf("%d. %s\n", i + 1, moves[i]);

            System.out.print("Please choose a move: ");
            move = sc.nextInt() - 1;

            if ((move < 0) || (move > moves.length))
                System.out.println("Invalid choice. Please choose again");
            else
                notValid = false;
        } 

        BlavingadMoves humanMove = moves[move];
        System.out.printf("You chose: %s\n", humanMove);
        BlavingadMoves computerMove = ComputerMove();
        System.out.printf("Computer chose: %s\n", computerMove);

        // Get winner
        getWinner(humanMove, computerMove);
        this.rounds++;
    }

    //Generate computer move
    public BlavingadMoves ComputerMove() {
        Random random = new Random();
        int cpMove = random.nextInt(BlavingadMoves.values().length);
        return BlavingadMoves.values()[random.nextInt(BlavingadMoves.values().length)];
    }

    //Get winner of round
    public void getWinner(BlavingadMoves humanMove, BlavingadMoves computerMove) {
        if (humanMove == BlavingadMoves.DROMSLOTT && (computerMove == BlavingadMoves.GULLIGAST || computerMove == BlavingadMoves.PLUFSIG)
        || humanMove == BlavingadMoves.GULLIGAST && (computerMove == BlavingadMoves.UPPSTA || computerMove == BlavingadMoves.SOLSKUR)
        || humanMove == BlavingadMoves.UPPSTA && (computerMove == BlavingadMoves.DROMSLOTT || computerMove == BlavingadMoves.PLUFSIG)
        || humanMove == BlavingadMoves.PLUFSIG && (computerMove == BlavingadMoves.SOLSKUR || computerMove == BlavingadMoves.GULLIGAST)
        || humanMove == BlavingadMoves.SOLSKUR && (computerMove == BlavingadMoves.DROMSLOTT || computerMove == BlavingadMoves.DROMSLOTT)) {
            System.out.printf("The computer's move is: %s. the user's move is: %s.\nHuman is the winner of this round. \n", computerMove, humanMove);
            this.humanWins++;
        } else {
            System.out.printf("The computer's move is: %s. the user's move is: %s.\nComputer is the winner of this round. \n", computerMove, humanMove);
            this.computerWins++;
        }
    }

    //Display results
    public void DisplayResults() {
        System.out.printf("Round played: %d\n", this.rounds);
        System.out.printf("User wins: %d\n", this.humanWins);
        System.out.printf("Computer wins: %d\n", this.computerWins);
    }

    public static void main(String [] args) {
        
        Blavingad blavingad = new Blavingad();
        blavingad.displayRules();

        boolean play = true;
        while (play) {
            System.out.print("Would you like to play a round? y/n ");
            String choice = blavingad.sc.next();

            if (choice.equalsIgnoreCase("y")) {
                //Play a round
                blavingad.Play();
            } else if (choice.equalsIgnoreCase("n"))
                play = false;
            else
                System.out.println("Invalid input, please try again");
        }

        //Display results
        blavingad.DisplayResults();
    }
}
