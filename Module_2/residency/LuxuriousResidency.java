package residency;

public class LuxuriousResidency extends Residency{
    int amenityCharge;

    public LuxuriousResidency(int amenityCharge){
        this.amenityCharge = amenityCharge;
    }

    public long getPriceOfResidency() {
        return 500000+ this.amenityCharge;
    }

}