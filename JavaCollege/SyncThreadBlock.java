import java.io.*;
import java.util.*;

class Calculation
{
    int cnt = 0;
    
    //synchronized block
    void printingPower(int temp)
    {
        synchronized(this)
        {
            int v = 1;
            for (cnt = 1; cnt <= 5; ++cnt){
                v *= temp;
                System.out.println("Power of " + temp + " ^ " + cnt + " is " + v);
            }
        }   
    }

    Calculation (){}
}

public class SyncThreadBlock {
    public static void main(String[] args)
    {
        
        Calculation c1 = new Calculation();
        Runnable r1 = new Runnable()
        {
            public void run()
            {
                c1.printingPower(2);
            }
        };

        Runnable r2 = new Runnable() {
            public void run()
            {
                c1.printingPower(10);
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();

        Thread t2 = new Thread(r2);
        t2.start();
    }
}
