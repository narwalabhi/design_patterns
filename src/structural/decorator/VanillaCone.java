package structural.decorator;

public class VanillaCone implements AddOn{

    private AddOn addOn;

    public VanillaCone(){}

    public VanillaCone(AddOn addOn) {
        this.addOn = addOn;
    }

    @Override
    public String getDescription() {
        return addOn == null ? "Vanilla Cone" : addOn.getDescription() + ", Vanilla Cone";
    }

    @Override
    public double getCost() {
        return addOn == null ? 10 : addOn.getCost() + 10;
    }
}
