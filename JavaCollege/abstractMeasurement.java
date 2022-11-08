import java.util.Scanner;

public class abstractMeasurement{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        heightMeasurement hm1 = new heightMeasurement(1, 2);
        heightMeasurement hm2 = new heightMeasurement(2, 3);

        distanceMeasurement dm1 = new distanceMeasurement(3, 6);
        distanceMeasurement dm2 = new distanceMeasurement(7, 8);

        Measurement m1 = hm1.getDifference(hm1, hm2);
        Measurement m2 = dm1.getDifference(dm1, dm2);
        System.out.println(m1.getUnit1() + ", " + m1.getUnit2());

        System.out.println(m2.getUnit1() + ", " + m2.getUnit2());

        dm1.printMeasurement();
        hm1.printMeasurement();

        sc.close();
    }
}

abstract class Measurement{
    int unit1;    
    int unit2;    

    //Default Constructor
    Measurement()
    {
        this.unit1 = 0;
        this.unit2 = 0;
    }

    //Copy constructor
    Measurement(Measurement m)
    {
        this.unit1 = m.unit1;
        this.unit2 = m.unit2;
    }

    //Constructor initialising default values
    Measurement(int u1, int u2)
    {
        this.unit1 = u1;
        this.unit2 = u2;
    }

    void setUnit1(int u1)
    {
        this.unit1 = u1;
    }

    void setUnit2(int u2)
    {
        this.unit2 = u2;
    }

    int getUnit1()
    {
        return this.unit1;
    }

    int getUnit2()
    {
        return this.unit2;
    }

    abstract Measurement getDifference(Measurement m1, Measurement m2);
    abstract void printMeasurement();
}

class heightMeasurement extends Measurement{
    //Unit1 in feet 

    heightMeasurement(int u1, int u2)
    {
        this.unit1 = u1;
        this.unit2 = u2;
    }
    heightMeasurement()
    {
        this.unit1 = 0;
        this.unit2 = 0;
    }

    Measurement getDifference(Measurement hm1, Measurement hm2)
    {
        heightMeasurement m1 = new heightMeasurement();
        int inchesOfHM1 = hm1.unit1 * 12 + hm1.unit2;
        int inchesOfHM2 = hm2.unit1 * 12 + hm2.unit2;

        int diffHeight = Math.abs(inchesOfHM1 - inchesOfHM2);

        int unit1M1 = diffHeight / 12;
        int unit2M1 = diffHeight % 12;
        m1.unit1 = unit1M1;
        m1.unit2 = unit2M1;
        return m1;
    }

    void printMeasurement()
    {
        System.out.println("Feet = " + this.unit1 + "\nInches = " + this.unit2);
    }
}

class distanceMeasurement extends Measurement{
    //Unit1 in feet 
    distanceMeasurement(int u1, int u2)
    {
        this.unit1 = u1;
        this.unit2 = u2;
    }

    distanceMeasurement()
    {
        this.unit1 = 0;
        this.unit2 = 0;
    }

    Measurement getDifference(Measurement dm1, Measurement dm2)
    {
        distanceMeasurement m1 = new distanceMeasurement();
        int metersOfHM1 = dm1.unit1 * 1000 + dm1.unit1;
        int metersOfHM2 = dm2.unit1 * 1000 + dm2.unit2;

        int diffdis = Math.abs(metersOfHM1 - metersOfHM2);

        int unit1M1 = diffdis / 1000;
        int unit1M2 = diffdis % 1000;
        m1.unit1 = unit1M1;
        m1.unit2 = unit1M2;
        return m1;
    }

    void printMeasurement()
    {
        System.out.println("KM = " + this.unit1 + "\nMeter = " + this.unit2);
    }
}