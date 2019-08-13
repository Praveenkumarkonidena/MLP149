import java.util.Scanner;
public class App{
    private String name;

    public App() {
        this.name = null ;
    }
    

    public App(String name) {
        this.name = name;
    }

    public void show() {
        Scanner option = new Scanner(System.in, "UTF-8");
        System.out.println("Enter name:");
        String model3 = option.next();
        System.out.println("name : " +model3);
    }
    
    public void show1() {
        Scanner option = new Scanner(System.in, "UTF-8");
        System.out.println("Enter name:");
        String model4 = option.next();
        System.out.println("name is : " + model4);
    }
}