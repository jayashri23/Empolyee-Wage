package com.emplyeewage2;

interface   ComputeEmpWage {

    public void addCompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHoursPerMonth);
    public void computeEmpWage();
    public int getTotalWage(String companyName);

}
public class CompanyEmpWage  {
    final int empRatePerHour;
    private final String companyName;
    final int numWorkingDays;

    final int maxHoursPerMonth;
    int totalWage;

    public CompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHoursPerMonth) {


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
