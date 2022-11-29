package com.emplyeewage;
import java.util.Random;

public class TillCondition {
    public static void main(String[] args) {

        int totalWorkingDays=20;
        int totalWorkingHours=100;
        int wagePerHour =20;
        int noOfWorkingDays=1;
        int noOfWorkingHours=0;
        int workingHours;
        Random rand = new Random();
        int check = rand.nextInt(3);
        while (noOfWorkingDays<=totalWorkingDays || noOfWorkingHours <=totalWorkingHours) {

            switch (check) {
                case 0:
                    System.out.println("Day: " + noOfWorkingDays);
                    workingHours = 16;
                    System.out.println("Full Time");
                    int empWage = wagePerHour * workingHours;
                    System.out.println("Wage = " + empWage);
                    noOfWorkingHours=noOfWorkingHours+workingHours;
                    System.out.println("Working hours: " + noOfWorkingHours);
                    break;
                case 1:
                    System.out.println("Day: " + noOfWorkingDays);
                    workingHours = 8;
                    System.out.println("Part Time ");
                    empWage = wagePerHour * workingHours;
                    System.out.println("Wage  = " + empWage);
                    noOfWorkingHours=noOfWorkingHours+workingHours;
                    System.out.println("Working hours: " + noOfWorkingHours);
                    break;
                case 2:
                    System.out.println("Day: " + noOfWorkingDays);
                    workingHours = 0;
                    System.out.println("Employee is Absent ");
                    empWage = wagePerHour * workingHours;
                    System.out.println("Wage = " + empWage);
                    noOfWorkingHours=noOfWorkingHours+workingHours;
                    System.out.println("Working hours: " + noOfWorkingHours);
                    break;

            }noOfWorkingDays++;
            System.out.println("-------------------------------");
        }
    }
}





