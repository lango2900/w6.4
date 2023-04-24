import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.NavigableMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;


public class Hashing {
    public static void main(String[] args) {

        Map<String, Integer> nimp = new HashMap<>();
        nimp.put("epsilon",5);
        nimp.put("iota",9);
        nimp.put("delta",4);
        nimp.put("zeta",6);
        nimp.put("alpha",1);
        nimp.put("beta",2);
        nimp.put("eta",7);
        nimp.put("gamma",3);
        nimp.put("theta",4);
        System.out.println("Map using HashMap: " + nimp);

        Map<String, Integer> limp = new TreeMap<>();

        limp.put("epsilon",5);
        limp.put("iota",9);
        limp.put("delta",4);
        limp.put("zeta",6);
        limp.put("alpha",1);
        limp.put("beta",2);
        limp.put("eta",7);
        limp.put("gamma",3);
        limp.put("theta",4);
        System.out.println("Map using TreeMap: " + limp);



    }
}