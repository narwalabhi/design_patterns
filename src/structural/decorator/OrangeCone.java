package structural.decorator;

public class OrangeCone implements AddOn {

    private AddOn addOn;

    public OrangeCone(){}

    public OrangeCone(AddOn addOn) {
        this.addOn = addOn;
    }

    @Override
    public String getDescription() {
        return addOn == null ? "Orange Cone" : addOn.getDescription() + ", Orange Cone";
    }

    @Override
    public double getCost() {
        return addOn == null ? 10 : addOn.getCost() + 10;
    }
}
