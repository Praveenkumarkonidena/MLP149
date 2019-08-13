 import java.util.*;

public class TreeMapDemo{
    public static void main(String[] args){       
      /*  Map<Integer,String> days = new TreeMap<Integer,String>();
        days.put(1,"AAA");
        days.put(2,"BBB");
        days.put(4,"123");
        days.put(3,"444");
        days.put(6,"123");
        days.put(8,"444");
        
        int i = 3;
        String day = days.get(i);
        System.out.println( days.keySet()+" => complete tree "+i+" => tree map : +>"+day);
*/

        Hashtable<Integer,String> h = new Hashtable<Integer,String>();   
        h.put(1,"AAA");
        h.put(2,"BBB");
        h.put(4,"123");
        h.put(3,"444");
        h.put(6,"123");
        h.put(8,"444");
        Set<Integer> keys = h.keySet();
        System.out.println(keys);
        System.out.println("values : " + h);

    }
    }     