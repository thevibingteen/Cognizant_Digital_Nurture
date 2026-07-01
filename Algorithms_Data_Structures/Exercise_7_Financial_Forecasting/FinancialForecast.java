package Algorithms_Data_Structures.Exercise_7_Financial_Forecasting;

public class FinancialForecast {

    public static double predictValue(double currentValue, double growthRate, int years) {

        if (years == 0) {
            return currentValue;
        }

        return predictValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double annualGrowthRate = 0.08;
        int years = 5;

        double futureValue = predictValue(currentValue, annualGrowthRate, years);

        System.out.printf("Current Value : %.2f%n", currentValue);
        System.out.printf("Growth Rate   : %.2f%%%n", annualGrowthRate * 100);
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : %.2f%n", futureValue);
    }
}