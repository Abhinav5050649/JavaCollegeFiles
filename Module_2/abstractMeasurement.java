import java.util.Scanner;

import javax.print.attribute.standard.MediaSizeName;

// use of static and final keyword
abstract class Measurement{
    protected int unit1;
    protected int unit2;
    
    public
    Measurement()
    {
        this.unit1 = 0;
        this.unit2 = 0;
    }

    Measurement(int u1, int u2)
    {
        this.unit1 = u1;
        this.unit2 = u2;
    }

    void setUnit1(int u1)
    {
        this.unit1 = u1;
    }

    int getUnit1()
    {
        return this.unit1;
    }

    void setUnit2(int u2)
    {
        this.unit2 = u2;
    }

    int getUnit2()
    {
        return this.unit2;
    }

    abstract void printMeasurement(Measurement m);
    abstract Measurement getDifference(Measurement m, Measurement n);
}

class HeightMeasurement extends Measurement{

    HeightMeasurement(int u1, int u2)
    {
        this.unit1 = u1;
        this.unit2 = u2;
    }

    HeightMeasurement()
    {
        this.unit1 = 0;
        this.unit2 = 0;
    }

    void printMeasurement()
    {
        System.out.println();
    }

    Measurement getDifference(Measurement m ,Measurement n )
    {
        HeightMeasurement mn = new HeightMeasurement();

         mn.unit1 = m.unit1 - n.unit1;
         mn.unit2 = m.unit2 - n.unit2;

         return mn;
    }

    void printMeasurement(Measurement m) {
        System.out.println(m.getDifference());
    }

}

class DistanceMeasurement extends Measurement{
    
    DistanceMeasurement(int u1, int u2)
    {
        this.unit1 = u1;
        this.unit2 = u2;
    }

    DistanceMeasurement()
    {
        this.unit1 = 0;
        this.unit2 = 0;
    }
    
    Measurement getDifference(Measurement m ,Measurement n )
    {
        DistanceMeasurement mn = new DistanceMeasurement();

         mn.unit1 = m.unit1 - n.unit1;
         mn.unit2 = m.unit2 - n.unit2;

         return mn;
    }

    void printMeasurement(Measurement m) {
        System.out.println(m.getDifference());
    }

}

public class abstractMeasurement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DistanceMeasurement dsm1 = new DistanceMeasurement(1, 2);
        dsm1.getDifference();
        dsm1.printMeasurement();

        HeightMeasurement hm1 = new HeightMeasurement(1, 2);
        hm1.getDifference();
        hm1.printMeasurement();
        
        sc.close();
    }
}