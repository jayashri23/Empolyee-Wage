package com.emplyeewage;



public class EmployeeComputation {
    final int empRatePerHour;
    private final String companyName;
    final int numWorkingDays;

    final int maxHoursPerMonth;
    private int totalWage;

    public EmployeeComputation(String companyName, int empRatePerHour, int numWorkingDays, int maxHoursPerMonth) {


        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numWorkingDays = numWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void setTotalWage(int totalWage){
        this.totalWage=totalWage;
    }
    @Override
    public String toString() {

        return " Total Employee Wage for company : " + companyName + " is " + totalWage;
    }
}
