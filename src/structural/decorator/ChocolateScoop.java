package structural.decorator;

public class ChocolateScoop implements AddOn{

    private final AddOn addOn;

    public ChocolateScoop(AddOn addOn){
        this.addOn = addOn;
    }

    @Override
    public String getDescription() {
        return addOn.getDescription() + ", Chocolate Scoop";
    }

    @Override
    public double getCost() {
        return addOn.getCost() + 30;
    }
}
