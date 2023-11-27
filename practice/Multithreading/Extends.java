
class Hii extends Thread{
    public void run(){
        
        for(int i=0;i<10;i++){
            System.out.println("Hi");
        }
    }
}

class Hello extends Thread{
    public void run(){
       for(int i=0;i<10;i++){
            System.out.println("Hello");
        }
    }
}


public class Extends {

    public static void main(String[] args){

        Thread t1 = new Hello();
        Thread t2 = new Hii();

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){}

        System.out.println("End of program .");

    }
    
}
