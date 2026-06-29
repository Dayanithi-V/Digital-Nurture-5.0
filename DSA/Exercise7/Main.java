package com.dn5.dsa.exercise7;

public class Main {

    public static void main(String[] args) {

        double initialAmount = 10000;
        double annualGrowthRate = 0.10;
        int remainingYears = 5;

        double futureAmount = FinancialForecast.forecastInvestment(
                initialAmount,
                annualGrowthRate,
                remainingYears
        );

        System.out.println("Initial Amount : " + initialAmount);
        System.out.println("Annual Growth Rate : " + (annualGrowthRate * 100) + "%");
        System.out.println("Number of Years : " + remainingYears);
        System.out.println("Predicted Future Value : " + futureAmount);
    }
}