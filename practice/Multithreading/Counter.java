public class Counter {
    int count;

    public Counter(){
        count=0;
    }

    public synchronized void display(){
        System.out.println(count + "    Thread:"+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
        count++;
    }

    public static void main(String[] args){
        Counter c = new Counter();

        Thread t1 = new Thread( ()->{
            c.display();
            try{
                Thread.sleep(10);
            } catch(Exception e){}
        });

        Thread t2 = new Thread( ()->{
            c.display();
        });

        System.out.println("Thread t1 state before starting: " + t1.getState());
        t1.setName("t1 thread");
        t2.setName("t2 Thread");
        t1.start();

        t2.start();


        try{
            System.out.println("Thread t1 state while running: " + t1.getState());
            t1.join();
            t2.join();
        } catch(Exception e){}

        System.out.println("Thread t1 state after completion: " + t1.getState());
        System.out.println("Inside main");
    }
}
