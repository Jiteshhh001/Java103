package Unit2;

public class Thread1 extends Thread {
    public void run()
    {
        for(int i=0;i<7;i++)
        {
//            System.out.println(i);
            try{
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            if(i%2==0)
                System.out.println(i);
        }
    }
}
