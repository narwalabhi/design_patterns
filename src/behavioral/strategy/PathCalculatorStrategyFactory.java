package behavioral.strategy;

public class PathCalculatorStrategyFactory {

    public static PathCalculatorStrategy getPathCalculatorStrategy(Strategy strategy) {
        return switch (strategy) {
            case CAR -> new CarPathCalculatorStrategy();
            case BIKE -> new BikePathCalculatorStrategy();
            case WALKING -> new WalkingPathCalculatorStrategy();
        };
    }

}
