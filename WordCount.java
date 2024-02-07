import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class WordCount {
    private Map<String, Integer> wordMap = new HashMap<>();

    public String getInput() {
        String text = "";
        try {
            File file = new File("word.txt");
            Scanner sc = new Scanner(file);

            sc.useDelimiter("\\Z");
            text = sc.next();

            /*while(sc.hasNextLine()) {
                String text = sc.nextLine();
                System.out.println(text);
            }*/

        } catch (FileNotFoundException ex) {
            System.out.println("Can't find file");
        }  

        return text;
    }

    public void count(String text) {
        String[] words = text.toLowerCase().split(" ");
        
        for (String word : words) {
            if(word.isEmpty()) continue;
            if(wordMap.containsKey(word))
                wordMap.put(word, wordMap.get(word) + 1);
            else
                wordMap.put(word, 1);
        }
    }

    public static void main(String[] args) {
        WordCount wc = new WordCount();
        String text = wc.getInput();
        //text = "To be or not to be";
        wc.count(text);

        //for(Map.Entry<String, Integer> pair : wc.countWords.entrySet())
        //    System.out.println(pair.getKey() + ": " + pair.getValue());
        
        wc.wordMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(10).forEach(System.out::println);
    }
}
