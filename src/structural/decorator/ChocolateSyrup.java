package structural.decorator;

public class ChocolateSyrup implements AddOn{

    private final AddOn addOn;

    public ChocolateSyrup(AddOn addOn){
        this.addOn = addOn;
    }

    @Override
    public String getDescription() {
        return addOn.getDescription() + ", Chocolate Syrup";
    }

    @Override
    public double getCost() {
        return addOn.getCost() + 20;
    }
}
