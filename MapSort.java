import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MapSort {
    private Scanner sc;

    public void newPlayer(Map<String, Integer> winners) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = sc.nextLine();
        System.out.println("Enter a value between 0 and 1000");
        int value = sc.nextInt();

        List <Entry<String, Integer>> wList = new ArrayList<>(winners.entrySet());
        wList.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        if ((winners.size() >= 5) && (value > wList.get(wList.size()-1).getValue())) {
            winners.remove(wList.get(wList.size()-1).getKey());
            winners.put(name, value);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> winners = new HashMap<>();

        winners.put("Sean", 600);
        winners.put("Grace", 500);
        winners.put("Heidi", 300);
        winners.put("James", 200);
        winners.put("Tom", 100);

        System.out.println(winners);
        System.out.println();
        winners.forEach((k, v)->System.out.println(k + ": " + v));

        List <Entry<String, Integer>> wList = new ArrayList<>(winners.entrySet());
        System.out.println();
        System.out.println("Sort by key: ");
        wList.sort(Entry.comparingByKey());
        wList.forEach(System.out::println);
        System.out.println();

        System.out.println("Sort by key descending: ");
        wList.sort(Entry.comparingByKey(Comparator.reverseOrder()));
        wList.forEach(System.out::println);
        System.out.println();

        wList.sort(Entry.comparingByValue());
        System.out.println("Sorted: ");
        wList.forEach(System.out::println);
        System.out.println();

        wList.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println("Sorted in reverse: ");
        wList.forEach(System.out::println);
        System.out.println();

        System.out.println(winners);
        new MapSort().newPlayer(winners);
        wList = new ArrayList<>(winners.entrySet());
        wList.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println(wList);
    }
}


