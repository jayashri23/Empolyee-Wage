package com.emplyeewage;


import java.util.Random;

public class EmployeeWage {
    //constant variable declared
        static final int isPartTime =1 ;
        static final int isFullTime =2 ;
        static final int wagePerHour =20;
        static final int maxWorkingDays =20;
        static final int maxHours =100 ;

        //default constructor
        EmployeeWage(){
            System.out.println("Welcome to Employee Wage Computation ..!");
        }

    public EmployeeWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHoursPerMonth) {
    }

    public static int computeEmpWage(){
            int empHours =0;
            int totalWorkingHours = 0;
            int totalWorkingDays = 0;
            int totalEmpWage =0;
            Random random =new Random();
            while (totalWorkingHours <= maxHours && totalWorkingDays < maxWorkingDays){
                totalWorkingDays++;
                int check =random.nextInt(3);
                switch (check){
                    case isPartTime :
                        System.out.println("Part Time Present");
                        empHours =8;
                        break;
                    case isFullTime :
                        System.out.println("Full Time Present");
                        empHours =16;
                        break;
                    default:
                        empHours =0;
                        System.out.println("Absent");
                    }
                    totalEmpWage = totalEmpWage+empHours;
                System.out.println("Total Working Days :" + totalWorkingDays + " Employee Hours : " +empHours);
                }
            totalEmpWage =totalEmpWage+wagePerHour;
            System.out.println("Total Empolyee Wage = "+totalEmpWage );
            return totalEmpWage;
            }

    public static void main(String[] args) {
        computeEmpWage();
          }
    }

