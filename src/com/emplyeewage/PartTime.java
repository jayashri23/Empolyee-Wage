package com.emplyeewage;

import java.util.Random;

public class PartTime {
    public static void main(String[] args) {
        int wagePerHour =20;
        Random rand = new Random();
        int check = rand.nextInt(3);
        int workingHours;
        switch (check) {
            case 0:
            workingHours = 16;
            System.out.println("Employee is Present Full Time");
            int  dailyEmpWage = wagePerHour*workingHours;
            System.out.println("Daily Employee Wage = " + dailyEmpWage);
            break;
            case 1:
            workingHours = 8;
            System.out.println("Employee is Present Part Time ");
              dailyEmpWage = wagePerHour*workingHours;
            System.out.println("Daily Employee Wage = " + dailyEmpWage);
            break;
            case 2:
                workingHours = 0;
                System.out.println("Employee is Absent ");
                dailyEmpWage = wagePerHour*workingHours;
                System.out.println("Daily Employee Wage = " + dailyEmpWage);
        }
        System.out.println("-------------------------------------");

    }
}

