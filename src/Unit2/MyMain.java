package Unit2;

public class MyMain {
    public static void main(String[] args) {
        Thread1 th1= new Thread1();
        th1.start();
        Thread2 th2= new Thread2();
        th2.start();
//        System.out.println(th1.getName());
//        th1.setName(("KIET Thread"));
//        System.out.println(th1.getName());
    }
}
