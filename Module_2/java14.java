import java.io.*;
import java.util.*;

interface P1
{
    default void show()
    {
        System.out.println("P1");
    }
}   

interface P2
{
    default void show(){
        System.out.println("P2");    
    }
}

class obj implements P1, P2
{
    public void show()
    {
        P1.super.show();
        P2.super.show();
    }
}

public class java14 {
    public static void main(String[] args) {
        obj o = new obj();
        o.show();
    }   
}