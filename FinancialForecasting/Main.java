public class Main {

    // Recursive method
    public static double predictFutureValue(double currentValue, double growthRate, int years) {

        if (years == 0) {
            return currentValue;
        }

        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        double futureValue = predictFutureValue(currentValue, growthRate, years);

        System.out.printf("Future Value after %d years = %.2f%n", years, futureValue);
    }
}