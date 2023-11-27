class OddEvenClass{
    int counter = 1;

    public synchronized void printOdd(){

        while(counter <= 10){
            if(counter %2 == 0){
                try{
                    wait();
                }
                catch(Exception e){}
            }
            else{
                System.out.println(counter+ "   " + Thread.currentThread().getName());
                counter++;
                notify();
            }
        }
    }

    public synchronized void printEven(){
        while(counter <= 10){
            if(counter %2 != 0){
                try{
                    wait();
                }
                catch(Exception e){}
            }
            else{
                System.out.println(counter + "  " + Thread.currentThread().getName());
                counter++;
                notify();
            }
        }
    }
    
}

public class OddEven {
    public static void main(String[] args){
        
        OddEvenClass oed = new OddEvenClass();

        Thread t1 = new Thread(()->{
            oed.printOdd();
        });

        Thread t2 = new Thread(()->{
            oed.printEven();
        });

        t1.setName("Odd Printer");
        t2.setName("Even Printer");
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){}
    }
}
