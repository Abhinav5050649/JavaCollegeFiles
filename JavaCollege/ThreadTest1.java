import java.io.*;
import java.util.*;

public class ThreadTest1 {
    public static void main(String[] args)
    {
        Runnable r1 = new Runnable(){
            public void run()
            {
                for (int i = 1; i <= 5000; ++i) System.out.println("Welcome from child thread " + i + Thread.currentThread());
            }
        };
        
        Thread t1 = new Thread(r1);
        t1.setDaemon(true);
        t1.start();

        for (int i = 1; i <= 3000; ++i) System.out.println("Hello from main thread " + i);
    }
}
