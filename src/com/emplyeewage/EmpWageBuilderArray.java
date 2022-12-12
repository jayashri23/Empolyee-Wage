package com.emplyeewage;

public class EmpWageBuilderArray {
    public static  final int isPartTime = 1;
    public static  final int isFullTime= 2;

    private int numOfCompany=0;
    private EmployeeComputation[]  companyEmpWageArray;
    public EmpWageBuilderArray(){
        companyEmpWageArray= new EmployeeComputation[5];
    }

    private void addCompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHoursPerMonth){
        companyEmpWageArray[numOfCompany]=new EmployeeComputation(companyName,empRatePerHour,numWorkingDays,maxHoursPerMonth);
        numOfCompany++;
    }
    private void computeEmpWage(){
        for (int i=0; i<numOfCompany; i++){
            companyEmpWageArray[i].setTotalWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    private int computeEmpWage(EmployeeComputation companyEmpWage) {
        int empHour = 8;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingHours <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numWorkingDays) {
            totalWorkingDays++;
            int randomCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (randomCheck) {
                case isPartTime:
                    empHour = 4;
                    System.out.println("Employee is Present for Half Day");
                    break;
                case isFullTime:
                    empHour = 8;
                    System.out.println("Employee is Present for Full Day");
                    break;
                default:
                    empHour = 0;

            }
            totalWorkingHours += empHour;
            System.out.println("Working Days: " + totalWorkingDays + "  Employee Hours: " + empHour);
        }

        return  totalWorkingHours*companyEmpWage.empRatePerHour;
    }

    public static void main(String[] args) {
        System.out.println("\nWelcome to Employee Wage Computation Program");
        EmpWageBuilderArray emp=new EmpWageBuilderArray();
        emp.addCompanyEmpWage("Relience",10,2,10);
        emp.addCompanyEmpWage("Wipro",20,4,10);
        emp.computeEmpWage();
    }

}
