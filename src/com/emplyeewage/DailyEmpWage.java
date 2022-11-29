package com.emplyeewage;

import java.util.Random;

public class DailyEmpWage {

    public static void main(String[] args) {

        int wagePerHour =20;
        Random rand = new Random();
        int check = rand.nextInt(2);
        int workingHours;
        if (check == 1) {
            workingHours = 8;
            System.out.println("Employee is Present");
           int  dailyEmpWage = wagePerHour*workingHours;
            System.out.println("Daily Employee Wage = " + dailyEmpWage);
        } else {
            workingHours = 0;
            System.out.println("Employee is Absent");
            int  dailyEmpWage = wagePerHour*workingHours;
            System.out.println("Daily Employee Wage = " + dailyEmpWage);
        }
        System.out.println("-------------------------------------");

    }
}
