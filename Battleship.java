import java.util.Scanner;
import java.util.Random;

public class Battleship {
    public static void main(String [] args) {

        // generate sea map: random number of ships, and random location of ships
        /* 
        int[][] seaMap = {
            {0, 0 , 1, 0, 1},
            {1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0},
            {1, 0, 0, 0, 0}
        }; */

        int[][] seaMap = generateMap(5, 5, 5);
        displayMap(seaMap);

        int numOfShips = getNumOfShips(seaMap);
        int numOfTries = 0;

        System.out.println("Welcome to the sea battle. Sink all the ships!");
        System.out.print("There are " + numOfShips + " ships. ");

        // loop until all ships destroyed
        while (numOfShips > 0) {
            //  getInput
            System.out.print("Please enter the coordinate of the ship to destroy: ");
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int column = sc.nextInt();

            //  validate if it's a hit
            if (seaMap[row][column] == 1) {
                seaMap[row][column] = 0;
                numOfShips--;
                System.out.println("It is a HIT!");
                System.out.println(numOfShips + " to go.");
            } else  
                System.out.println("It is a MISS!");

            //  display updated sea map
            displayMap(seaMap);
            numOfTries++;
            //  keep counter of numOfShips, numOfTries
        }
            // display victory message, and numOfTries
            System.out.println("Victory!");
            System.out.println("You won in " + numOfTries + " tries");
        

        }   

    public static void displayMap(int[][] map) {
        String a = "~";
        String b = "S";
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++)
                if(map[i][j] == 0)
                    System.out.print(a + " ");
                else
                    System.out.print(b + " "); 
            System.out.println();
        }          
    }

    //stub
    public static int getNumOfShips(int[][] map) {
        int counter = 0;
        for (int r[] : map )
            for (int i : r)
                if (i == 1)
                    counter++;

        return counter;
    }

    // generate sea map: random number of ships, and random location of ships
    public static int[][] generateMap(int r, int c, int n) {
        int[][] map = new int[r][c];
        Random random = new Random();
        int numOfShips = random.nextInt(n) + 1; 
        System.out.println("There are " + numOfShips + " ships");

        /* for (int i = 0; i < numOfShips; i++) {
            int x = random.nextInt(r);
            int y = random.nextInt(c);
            map[x][y] = 1;
        } */

        while(numOfShips-- > 0)
            map[random.nextInt(r)][random.nextInt(c)] = 1;

        return map;
    }
}
