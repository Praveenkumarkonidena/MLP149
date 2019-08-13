import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListMethods{
    public static void main(String[] args){
         List<String> fruit1 = new ArrayList<String>();
        fruit1.add("A");
        fruit1.add("B");
        fruit1.add("C");
        fruit1.add("D");
        fruit1.add("E");

        List<String> fruit2 = new ArrayList<String>();
        fruit2.add("1");
        fruit2.add("2");
        fruit2.add("3");
        fruit2.add("4");
        fruit2.add("5");

        List<String> al = new ArrayList<String>();
        al.addAll(fruit1);
        System.out.println(al);

        al.addAll(fruit2);
        System.out.println(al);

        al.addAll(fruit1);
        System.out.println(al);

       /* 
        al.removeAll(fruit1);
        System.out.println(al);
        */

        /*
        al.retainAll(fruit1);
        System.out.println(al);

        */

        
    }
}           