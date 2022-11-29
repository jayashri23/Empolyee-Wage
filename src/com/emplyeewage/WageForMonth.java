package com.emplyeewage;

import java.util.Random;

public class WageForMonth {

    public static void main(String[] args) {
        int noOfWorkingDays=20;
        int wagePerHour =20;
        Random rand = new Random();
        int check = rand.nextInt(3);
        int workingHours;
        switch (check) {
            case 0:
                workingHours = 16;
                System.out.println("Employee is Present Full Time");
                int  empWage = wagePerHour*workingHours;
                int monthlyEmpWage=noOfWorkingDays*empWage;
                System.out.println("Employee Wage For Month= " + monthlyEmpWage);
                break;
            case 1:
                workingHours = 8;
                System.out.println("Employee is Present Part Time ");
                empWage = wagePerHour*workingHours;
                 monthlyEmpWage=noOfWorkingDays*empWage;
                System.out.println("Employee Wage For Month= " + monthlyEmpWage);
                break;
            case 2:
                workingHours = 0;
                System.out.println("Employee is Absent ");
                empWage = wagePerHour*workingHours;
                 monthlyEmpWage=noOfWorkingDays*empWage;
                System.out.println("Employee Wage For Month = " + monthlyEmpWage);
        }
        System.out.println("-------------------------------------");

    }
}



