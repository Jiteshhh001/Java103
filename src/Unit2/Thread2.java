package Unit2;

public class Thread2 extends Thread{
    public void run(){
        for(int i=0;i<7;i++){
            try{
                Thread.sleep(450);

            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            if(i%2!=0)
                System.out.println(" "+i);
        }
    }
}
