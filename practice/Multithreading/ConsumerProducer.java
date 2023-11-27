class CounsumerProducerHandler {
    int ready=0;
    int totalProduced =0;
    static int requiredProduction = 10;

    public synchronized void producer(){

        while(totalProduced <=requiredProduction){

            
            if(ready <= 5){
                totalProduced++;
                ready++;
                System.out.println("Produced    |" + "total ready: " + ready);
                notify();

            }
            else{
                try{
                    wait();
                }
                catch(Exception e){}
            }
            
        }

    }
    public synchronized void counsumer(){
        while(totalProduced <=requiredProduction || ready>0){
            if(ready == 0 ){
                try{
                    wait();
                }
                catch(Exception e){

                }
            }
            else{
                ready--;
                System.out.println("Consumed    |" + "total ready : " + ready);
                notify();
            }
        }
    }
}
public class ConsumerProducer {

    public static void main(String[] args){

        CounsumerProducerHandler handler = new CounsumerProducerHandler();

        Thread t1 = new Thread(()->{
            handler.producer();
        });
        Thread t2 = new Thread(()->{
            handler.counsumer();
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){

        }
    }
    
}
