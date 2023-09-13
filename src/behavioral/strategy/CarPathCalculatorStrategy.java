package behavioral.strategy;

import java.util.Random;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy{

    private final Random random = new Random();

    @Override
    public String calculatePath(String source, String destination) {
        return "Car path from " + source + " to " + destination + " by car is : " + random.nextInt(100) + " kms";
    }
}
