import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayVsList{
    public static void main(String[] args){
        String[] str = {"one", "two", "three", "four","five"};
        List<String> strList = Arrays.asList(str);
    for (String st : strList){
        System.out.println(st);
    }
}
}