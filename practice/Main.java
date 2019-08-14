import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner option = new Scanner(System.in, "UTF-8");
        System.out.println("Enter Model:");
        String model1 = option.next();
        System.out.println("Enter year:");
        String year1 = option.next();
        Car car1 = new Car(model1,year1);
        String m = car1.getModel();
        String y = car1.getYear();
        System.out.println(car1);
    }

}