package com.emplyeewage2;

public class EmployeeWageComputation {

    static final int fullTime = 1;
    static final int partTime=2;
    private  final String companyName;
    private  final int empRatePerHour;
    private  final int numOfWorkingDays;
    private  final int maxHourMonth;
    private int totalEmpWage;
    public EmployeeWageComputation(String companyName,int empRatePerHour,int numOfWorkingDays,int maxHourMonth) {
        this.companyName=companyName;
        this.empRatePerHour=empRatePerHour;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHourMonth=maxHourMonth;

    }
    public void  computeEmpWage(){
        int empHour = 0;
        int totalEmpHour = 0;
        int totalWorkingDays = 0;
        while (totalEmpHour <= maxHourMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int Check = (int) Math.floor(Math.random() * 10) % 3;
            switch (Check) {
                case partTime:
                    System.out.println("Employee is Full time.");
                    empHour=8;
                    break;
                case fullTime:
                    System.out.println("Employee is Part time");
                    empHour=4;
                    break;
                default:
                    empHour =0;
            }
            totalEmpHour += empHour;
            System.out.println("Total Working Days: " + totalWorkingDays + " Employee Hours: " + empHour);

        }
        totalEmpWage = totalEmpHour * empRatePerHour;

    }
    @Override
    public  String toString(){
        return  "Total Employee Wage For Each Company: "+companyName+ " is "+totalEmpWage;
    }
    public static void main(String[] args) {
        System.out.println("\n******** Welcome To Employee Wage Computation ********");
        EmployeeWageComputation Wipro=new EmployeeWageComputation("Wipro",20,2,10);
        EmployeeWageComputation RelienceJio=new EmployeeWageComputation("RelienceJio",30,4,10);
        Wipro.computeEmpWage();
        System.out.println(Wipro);
        RelienceJio.computeEmpWage();
        System.out.println(RelienceJio);
    }
}
