package testpacakage;
import residency.LuxuriousResidency;
import residency.TwoBhkResidency;

public class ResidencyTesting {
    public static void main(String args[]) {
        TwoBhkResidency tw1 = new TwoBhkResidency(1000,1000);
        System.out.println( tw1.getPriceOfResidency());

        LuxuriousResidency l1 = new LuxuriousResidency(5000);
        System.out.println(l1.getPriceOfResidency());
    }
}
