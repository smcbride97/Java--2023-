import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private List<String> words;
    private List<String> correctGuesses;
    private List<String> wrongGuesses;
    private Map<String, Integer> winners;

    private static final int MAXGUESSES  = 7;
    private static final int MAXWINNERS = 5;
    private static final String WINFILE = "HangmanWinners.csv";
    private int guesses, score;

    private Scanner sc;

    public Hangman(String fname) {
        try {
            Path path = Paths.get(fname);
            this.words = Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Cannot load dictionary file");
        }

        // initalize all variables
        this.correctGuesses = new ArrayList<>();
        this.wrongGuesses = new ArrayList<>();
        this.winners = new HashMap<>();
        this.guesses = this.score = 0;

        // load winners
        load(WINFILE);

        this.sc = new Scanner(System.in);
    }

    public String getWord() {
       Random random = new Random();
       return words.get(random.nextInt(this.words.size()));
    }

    public String getHiddenWord(String word) {
        String hiddenWord = "";
        for(int i = 0; i < word.length(); i++) 
            if (correctGuesses.contains(String.valueOf(word.charAt(i))))
                hiddenWord += word.charAt(i) + " ";
            else 
                hiddenWord += "_ ";

        return hiddenWord;
    }

    public void display() {
        if (wrongGuesses.size() > 0) {
            Collections.sort(wrongGuesses);
            System.out.print("Incorrect guesses: ");
                for (int i = 0; i < wrongGuesses.size(); i++)
                    if (i != (wrongGuesses.size() - 1))
                        System.out.print(wrongGuesses.get(i) + ", ");
                    else
                        System.out.print(wrongGuesses.get(i));
            System.out.println("\n");
        }

        System.out.printf("Guesses Left: %d\n\n", MAXGUESSES - guesses);
        System.out.printf("Score: %d\n\n", score);
    }

    public boolean getGuess(String word) {
        System.out.print("Enter next guess: ");
        String guess = sc.nextLine();

        int index = word.indexOf(guess);
            
        if(index == -1) {
            System.out.printf("\nSorry, there were no %s's\n\n", guess);
            if (!wrongGuesses.contains(guess))
                wrongGuesses.add(guess);
                guesses++;
            } else while (index != -1) {
                correctGuesses.add(guess);
                score += 10;
                index = word.indexOf(guess, index+1);
            }

            if(correctGuesses.size() == word.length()) {
                score += 100 + 30 *(MAXGUESSES - guesses);
                correctGuesses.clear();
                wrongGuesses.clear();
                guesses = 0;
                return true;
            }

            return false;

        }

    public void credit(Map<String, Integer> winners) {
        List <Entry<String, Integer>> wList = new ArrayList<>(winners.entrySet());

        if (winners.size() < MAXWINNERS) {
            System.out.println("Congratualations, you made it to the top " + MAXWINNERS + "\n");
            System.out.print("What's your name: ");
            winners.put(sc.nextLine(), score);
            wList = new ArrayList<>(winners.entrySet());
        } else {
            // already has 5 winners, if score > the lowest score, then replace the lowest
            // then sort in descending order        
            wList.sort(Entry.comparingByValue(Comparator.reverseOrder()));
            if (score > wList.get(wList.size()-1).getValue()) {
                System.out.println("Congratualations, you made it to the top " + MAXWINNERS + "\n");
                System.out.print("What's your name: ");
                winners.put(sc.nextLine(), score);
                winners.remove(wList.get(wList.size()-1).getKey());
                wList = new ArrayList<>(winners.entrySet());
            }
        }

        wList.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println("\nTop 5");
        for (int x = 0; x < MAXWINNERS; x++)
            System.out.println((x + 1) + ". " + wList.get(x).getKey() + " " + wList.get(x).getValue());
    }

    public void save(Map<String, Integer> winners, String fname) {
        try {
            FileWriter fileWriter = new FileWriter(new File(fname));
            for (Map.Entry<String, Integer> winner : winners.entrySet())
                fileWriter.write(winner.getKey() + ", " + winner.getValue() + "\n");

            fileWriter.close();
        } catch (IOException ex) {
            System.out.printf("Error writing %s\n", fname);
        }
    }

    public void load(String fName) {
        try {
            Scanner sc = new Scanner(new File(fName));

            while(sc.hasNextLine()) {
                String[] tokens = sc.nextLine().split(",");
                winners.put(tokens[0].strip(), Integer.parseInt(tokens[1].strip()));
            }
        } catch (FileNotFoundException ex) {
            System.out.printf("File %s not found\n", fName);
        }  

        //winners.forEach ((k, v) -> System.out.println(k + ", " + v));
    }

    public static void main(String[] args) {
        Hangman game = new Hangman("HangmanDict.txt");
        String word = game.getWord();

        while(game.guesses < MAXGUESSES) {
            //System.out.println(word + "\n");
            System.out.println("Hidden word: " + game.getHiddenWord(word) + "\n");
            game.display();
            if (game.getGuess(word)) {
                word = game.getWord();
            }
        }

        game.credit(game.winners);
        game.save(game.winners, WINFILE);
    }
}
