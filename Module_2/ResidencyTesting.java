//package residency;

abstract class Residency{
    String name;
    int rNumber;
    int area;
    int unit_rate;

    abstract long getPriceOfResidency();

    public Residency(){
        System.out.println("Default constructor");
    }
    public Residency(String name , int rNumber, int area){
        this.name = name;
        this.rNumber = rNumber;
        this.area = area;


    }
    public Residency(Residency r){
        r.name = name;
        r.rNumber = rNumber;
        r.area = area;
    }

    public
    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    int getRNumber(){
        return rNumber;
    }

    void setRNumber(int rNumber){
        this.rNumber = rNumber;
    }

    int getArea(){
        return area;
    }

    void setArea(int area){
        this.area =area;
    }

    int getUnitRate(){
        return unit_rate;
    }

    void setUnitRate(int unit_rate){
        this.unit_rate = unit_rate;
    }
}

interface Rentable {
    abstract public int getRent();
}

class Semi_FurnishedResidency extends Residency{
    int furnitureCharge,parkingCharge;

    public Semi_FurnishedResidency(int furnitureCharge , int parkingCharge){
        this.furnitureCharge = furnitureCharge;
        this.parkingCharge = parkingCharge;

    }
    public long getPriceOfResidency() {
        return 250000+this.furnitureCharge+this.parkingCharge;
    }    
}


class LuxuriousResidency extends Residency{
    int amenityCharge;

    public LuxuriousResidency(int amenityCharge){
        this.amenityCharge = amenityCharge;
    }

    public long getPriceOfResidency() {
        return 500000+ this.amenityCharge;
    }
}

class TwoBhkResidency extends Semi_FurnishedResidency implements Rentable{
    public TwoBhkResidency(int furnitureCharge, int parkingCharge) {
        super(furnitureCharge, parkingCharge);
    }

    public long getPriceOfResidency() {
        return super.getPriceOfResidency();
    }

    public int getRent() {
        return 25;
    }
}

public class ResidencyTesting {
    public static void main(String args[]) {
        TwoBhkResidency tw1 = new TwoBhkResidency(1000,1000);
        System.out.println( tw1.getPriceOfResidency());

        LuxuriousResidency l1 = new LuxuriousResidency(5000);
        System.out.println(l1.getPriceOfResidency());
    }  
}