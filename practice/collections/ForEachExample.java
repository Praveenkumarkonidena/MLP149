import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ForEachExample{
    public static void main(String[] args){
        List<String> fruits = new ArrayList<String>();
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        System.out.println("----------------Iterating--------------");
        Iterator itr = fruits.iterator();
        while(itr.hasNext()) {
            String fruit = (String) itr.next();
            System.out.println(fruit);
        }

        System.out.println("----------------Iterating for loop--------------");
        for(int i = 0; i< fruits.size(); i++) {
            String fruit1 = fruits.get(i);
            System.out.println(fruit1);
        }

        System.out.println("----------------Iterating for each java 1.5 version--------------");
        for(String fruit2 : fruits) {
            System.out.println(fruit2);
        }

        System.out.println("----------------Iterating by passing lambda java 1.8 version--------------");
        fruits.forEach(fruit3 -> System.out.println(fruit3));

        System.out.println("----------------Iterating by passing method--------------");
        fruits.forEach(System.out::println);

    }
}
        