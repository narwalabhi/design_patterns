package behavioral.strategy;

public class Main {

    public static void main(String[] args) {

        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorStrategyFactory.getPathCalculatorStrategy(Strategy.WALKING);

        System.out.println(pathCalculatorStrategy.calculatePath("A", "B"));

    }

}
