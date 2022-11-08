class OddEven{
    synchronized void oddprint(){
        for (int i = 0; i <= 20; i++) { 
            if(i%2!=0){
                try{
                    wait();
                }catch(Exception e){
                    System.out.println(e);
                }
                System.out.println(i);
            }
            notify();
        }
    }

    synchronized void evenprint(){
        for (int i = 0; i <= 20; i++) {
            if(i%2==0){
                try{
                    wait();
                }catch(Exception e){
                    System.out.println(e);
                }

                System.out.println(i);
            }
            notify();
        }
    }
}

public class SyncThreadBlockOddAndEven {
    public static void main(String[] args) {
    OddEven eo = new OddEven();

    Runnable r1 = new Runnable() {
        public void run(){
            eo.evenprint();
        }
    };

    Runnable r2 = new Runnable() {
        public void run(){
            eo.oddprint();
        }
    };

    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    
    t1.start();

    t2.start();

    }

    
}
