package com.emplyeewage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EmpWageBuilderArray  implements  EmployeeWage {

    static final int isPartTime = 1;
    static final int isFullTime = 2;
    private int numOfCompany = 0;
    private List<EmployeeWage> companyEmpWageList;
    private Map<String, EmployeeWage> companyToEmpWageMap;


    public EmpWageBuilderArray() {
        companyEmpWageList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();

    }


    public void addCompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHoursPerMonth) {
        EmployeeWage companyEmpWage = new EmployeeWage(companyName, empRatePerHour, numWorkingDays, maxHoursPerMonth);
        companyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(companyName, companyEmpWage);

    }

    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {

            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setTotalWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

    @Override
    public int getTotalWage(String companyName) {

        return companyToEmpWageMap.get(companyName).totalWage;


    }

    public int computeEmpWage(CompanyEmpWage companyEmpWage) {


        return 0;
    }

    public static void main(String[] args) {
        System.out.println("\nWelcome to Employee Wage Computation Program");
        ComputeEmpWage empWageBuilder = new EmpWageBuilderArray();
        empWageBuilder.addCompanyEmpWage("Relience", 10, 2, 10);
        empWageBuilder.addCompanyEmpWage("Wipro", 20, 4, 20);
        empWageBuilder.computeEmpWage();
        System.out.println("Total Wage for Relience Company:" + empWageBuilder.getTotalWage("Relience"));
        System.out.println("Total Wage for Wipro Company:" + empWageBuilder.getTotalWage("Wipro"));

    }
}
