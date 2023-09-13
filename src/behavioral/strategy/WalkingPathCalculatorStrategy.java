package behavioral.strategy;

import java.util.Random;

public class WalkingPathCalculatorStrategy implements PathCalculatorStrategy{

    private final Random random = new Random();

    @Override
    public String calculatePath(String source, String destination) {
        return "Walking path from " + source + " to " + destination + " by walking is : " + random.nextInt(100) + " kms";
    }
}
