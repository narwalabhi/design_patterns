package behavioral.strategy;

import java.util.Random;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy{

    private final Random random = new Random();

    @Override
    public String calculatePath(String source, String destination) {
        return "Bike path from " + source + " to " + destination + " by bike is : " + random.nextInt(100) + " kms";
    }
}
