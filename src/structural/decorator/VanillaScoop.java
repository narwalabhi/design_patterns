package structural.decorator;

public class VanillaScoop implements AddOn{

    private final AddOn addOn;

    public VanillaScoop(AddOn addOn) {
        this.addOn = addOn;
    }

    @Override
    public String getDescription() {
        return addOn.getDescription() + ", Vanilla Scoop";
    }

    @Override
    public double getCost() {
        return addOn.getCost() + 35;
    }
}
