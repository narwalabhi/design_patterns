package structural.decorator;

public class ChocoChips implements AddOn {

    private final AddOn addOn;

    public ChocoChips(AddOn addOn) {
        this.addOn = addOn;
    }

    @Override
    public String getDescription() {
        return addOn.getDescription() + ", Choco Chips";
    }

    @Override
    public double getCost() {
        return addOn.getCost() + 25;
    }
}
