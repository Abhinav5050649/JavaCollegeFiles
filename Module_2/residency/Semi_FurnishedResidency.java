package residency;

public class Semi_FurnishedResidency extends Residency{
    int furnitureCharge,parkingCharge;

    public Semi_FurnishedResidency(int furnitureCharge , int parkingCharge){
        this.furnitureCharge = furnitureCharge;
        this.parkingCharge = parkingCharge;

    }
    public long getPriceOfResidency() {
        return 250000+this.furnitureCharge+this.parkingCharge;
    }

}
