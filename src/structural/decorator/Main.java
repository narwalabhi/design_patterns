package structural.decorator;

public class Main {

    public static void main(String[] args) {
        AddOn addOn = new ChocoChips(new ChocolateSyrup(new ChocolateScoop(new VanillaScoop(new VanillaCone(new ChocolateSyrup(new OrangeCone()))))));
        System.out.println(addOn.getDescription());
        System.out.println(addOn.getCost());
    }

}
