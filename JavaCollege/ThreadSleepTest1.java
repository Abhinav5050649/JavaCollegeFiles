import java.io.*;
import java.util.*;

public class ThreadSleepTest1 {
    public static void main(String[] args)
    {
        Runnable r = new Runnable() {
            
            public void run()
            {
                for (int i = 1; i <= 3000; ++i) System.out.println("Hello: " + i + " from child-thread: " + Thread.currentThread().hashCode());

                try{
                    Thread.sleep(5000);
                }
                catch(InterruptedException e)
                {
                    System.out.println("Sleep interrupted!");
                }
                System.out.println("**************** Goodbye ****************");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i = 1; i <= 5000; ++i)
        {
            System.out.println("Welcome: " + i + " from child-thread: " + Thread.currentThread().hashCode());
            t.interrupt();
        }
    }
}
