package residency;

public class TwoBhkResidency extends Semi_FurnishedResidency implements Rentable{
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