import java.util.Scanner;
public class Two extends One{
    Two(){
        Scanner option = new Scanner(System.in, "UTF-8");
        System.out.println("Enter name:");
        String model2 = option.next();
        // System.out.println(model2);
    }
}