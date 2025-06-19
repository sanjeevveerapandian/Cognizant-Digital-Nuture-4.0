public class Main {
    public static void main(String[] args) {
        double presentValue = 10000;  // ₹10,000 today
        double annualRate = 0.08;     // 8% annual growth
        int years = 5;

        // Using recursion
        double futureValueRecursive = FinancialForecast.predictFutureValue(presentValue, annualRate, years);
        System.out.printf("📈 Recursive - Future value after %d years: ₹%.2f%n", years, futureValueRecursive);

        // Using iteration
        double futureValueIterative = FinancialForecast.predictFutureValueIterative(presentValue, annualRate, years);
        System.out.printf("⚡ Iterative - Future value after %d years: ₹%.2f%n", years, futureValueIterative);
    }
}
