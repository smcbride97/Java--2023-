import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Route {
    private Map<String, String> map = new HashMap<String, String>();
    
    public Route() {
        map = load("Route.csv");
    }

    public List getRoute(String origin, String destination) {
        List <String> route = new ArrayList<String>();

        route.add(origin);
        String next = map.get(origin);
        boolean reachable = true;
        while (!next.equals(destination) && reachable) {
            route.add(next);
            if (map.keySet().contains(next))
                next = map.get(next);
            else
                reachable = false;
        }

        if(reachable)
            route.add(destination);
        else    
            route.clear();

        return route;
    }

    public Map<String, String> load(String file) {
        Map<String, String> map = new HashMap<String, String>();
        try {
            Scanner sc = new Scanner(new File(file));

            while(sc.hasNextLine()) {
                String[] tokens = sc.nextLine().split(",");
                map.put(tokens[0].strip(), tokens[1].strip());
            }
        } catch (FileNotFoundException ex) {
            System.out.printf("File %s not found\n", file);
        }

        return map;   
    }

    public static void main(String args[]) {
        Route route = new Route();
        System.out.println(route.map);
        System.out.println(route.getRoute("Maryland", "Pennsylvania"));
    }
}
