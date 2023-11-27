
class Hii implements Runnable{
    public void run(){
        
        for(int i=0;i<10;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}

        }

    }
}

class Hello implements Runnable{
    public void run(){
       for(int i=0;i<10;i++){
            System.out.println("Hello");

            try{
                Thread.sleep(600);
            }
            catch(Exception e){}
        }
    }
}


public class ImplementsRunnable{

    public static void main(String[] args){

        Hello hello = new Hello();
        Hii hii = new Hii();

        Thread t1 = new Thread(hello);
        Thread t2 = new Thread(hii);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
            Thread.sleep(2000);
        }
        catch(Exception e){}

        System.out.println("End of program .");

    }
    
}
