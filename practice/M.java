public class M{
    public static void main(String[] args){
        MyCls my = new MyCls();
        my.show();
        my.show("Praveen");
        int r = my.getRandom();
        System.out.println("r = "+r);
        int r1 = my.add(10,20);
        System.out.println("r1 = "+r1);
    }
}