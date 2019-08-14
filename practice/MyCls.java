public class MyCls implements MyInterface{
public void show(){
    System.out.println("show()");
}   
public void show(String name){
    System.out.println("Name :>"+name);
} 
public int getRandom(){
    double d = Math.random()*100;
    int i = (int) d;
    return i;
}
public int add(int a , int b){
    return(a+b);
}
}