package com.dn5.dsa.exercise7;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecastInvestment(double initialAmount,
                                            double annualGrowthRate,
                                            int remainingYears) {

        // Base case
        if (remainingYears == 0) {
            return initialAmount;
        }

        // Calculate amount after one year
        double updatedAmount = initialAmount + (initialAmount * annualGrowthRate);

        // Recursive call
        return forecastInvestment(updatedAmount,
                annualGrowthRate,
                remainingYears - 1);
    }
}