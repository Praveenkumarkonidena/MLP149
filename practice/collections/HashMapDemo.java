
import java.util.*;

public class HashMapDemo{
    public static void main(String[] args){
        Map<String,String> map = new LinkedHashMap<String,String>();
        map.put("111","AAA");
        map.put("222","BBB");
        map.put("null","123");
        map.put("null","444");
        // retrieving all keys
        System.out.println("Keys of hash map : "+ map.keySet());
        // retrieving all values
        System.out.println("Keys of hash map : "+ map.values());

       // String k = null;
        //String v = map.get(k);
        //System.out.println(v);

        System.out.println("For-each loop");
        for(String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key+"=>"+value);

        }
    }
}