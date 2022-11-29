package com.emplyeewage;

import java.util.Random;

public class UsingSwitchCase {

    public static void main(String[] args) {
        int wagePerHour =20;
        Random rand = new Random();
        int check = rand.nextInt(3);
        int workingHours;
        if (check == 1) {
            workingHours = 16;
            System.out.println("Empgitloyee is Present Full Time");
            int empWage = wagePerHour * workingHours;
            System.out.println(" Employee Wage = " + empWage);
        }
        else if (check == 2){
            workingHours = 8;
            System.out.println("Employee is Present Part Time ");
            int empWage = wagePerHour * workingHours;
            System.out.println(" Employee Wage = " + empWage);
        }
        else {
            workingHours = 0;
            System.out.println("Employee is Absent ");
            int dailyEmpWage = wagePerHour*workingHours;
            System.out.println(" Employee Wage = " + dailyEmpWage);
        }
        System.out.println("-------------------------------------");
    }
}
