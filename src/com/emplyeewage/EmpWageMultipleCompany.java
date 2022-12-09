package com.emplyeewage;

import java.util.Random;

public class EmpWageMultipleCompany {
    static final int fullTime =1;
    static final int partTime =2;
    private  String companyName;
    private  int empRatePerHours;
    private  int numOfWorkingDays;
    private  int maxHoursMonth;

    private int totalEmpWag;
    public EmpWageMultipleCompany(String companyName,int numOfWorkingDays,int empRatePerHours,int maxHoursMonth){
        this.companyName =companyName;
        this.numOfWorkingDays =numOfWorkingDays;
        this.empRatePerHours =empRatePerHours;
        this.maxHoursMonth =maxHoursMonth;
    }
    public void computeEmpWage(){
        int empHours =0;
        int totalEmpHours =0;
        int totalWorkingDays =0;
        Random random =new Random();
        while (totalEmpHours <= maxHoursMonth && totalWorkingDays < numOfWorkingDays){
            totalWorkingDays++;
            int check =random.nextInt(3);
            switch (check){
                case partTime:
                    System.out.println("Part Time Present");
                    empHours =8;
                    break;
                case fullTime:
                    System.out.println("Full Time Present");
                    empHours =16;
                    break;
                default:
                    empHours =0;
                    System.out.println("Absent");
            }
            totalEmpHours +=empHours;
            System.out.println("Total Working Days :" + totalWorkingDays + " Employee Hours : " +empHours);
        }
        totalEmpWag =totalEmpHours*empRatePerHours;
    }
    @Override
    public String toString(){
        return "Total Employee wage for company : " + companyName + " is " + totalEmpWag;
        }

    public static void main(String[] args) {
        System.out.println("----------Calculating employee Wage for each company---------------");
        EmpWageMultipleCompany wipro =new EmpWageMultipleCompany("Wipro",10,
                30,10);
        EmpWageMultipleCompany relince =new EmpWageMultipleCompany("Relince",15,20,
                25);
        wipro.computeEmpWage();
        System.out.println(wipro);
        relince.computeEmpWage();
        System.out.println(relince);
       }
    }
