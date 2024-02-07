import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

import oo.Point;

public class Boules {
    //private Map<String, Float> players = new HashMap <String, Float>();
    private Map<Float, String> players = new HashMap <Float, String>();

    public void selectionSort(Float[] distance) {

        for(int i = 0; i < distance.length - 1; i++) {
            int minIdx = i;
            for(int j = i + 1; j < distance.length; j++) 
                if (distance[j] < distance[minIdx])
                    minIdx = j;

            swap(distance, minIdx, i);
        }
    }

    public void swap(Float[] distance, int minIdx, int i) {
        float tmp = distance[minIdx];
        distance[minIdx] = distance[i];
        distance[i] = tmp;
    }

    public void getInput(String fName) {
        try {
            File file = new File(fName);    
            Scanner sc = new Scanner(file);
            int n = sc.nextInt();
            Point origin = new Point();

            for (int i = 0; i < n; i++){
                String name = sc.next();
                int x = sc.nextInt();
                int y = sc.nextInt();
                Point point = new Point(x,y);
                players.put(point.getDistance(origin), name);
                //players.put(name, point.getDistance(origin));
                //players.put(sc.next(), new Point(sc.nextInt(), sc.nextInt()).getDistance(origin));
            }
        } catch (FileNotFoundException ex) {
            System.out.printf("%s not found\n", fName);
        }
    }

    public void sort() {
       //this.players.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach((player)->System.out.println(player.getKey()));
       Float[] distance = players.keySet().toArray(new Float[0]);
       selectionSort(distance);

       for (float n : distance)
            System.out.println(players.get(n));
    }

    public static void main(String[] args) {
        Boules game = new Boules();
        game.getInput("Boules.in");
        game.sort();
    }
}
