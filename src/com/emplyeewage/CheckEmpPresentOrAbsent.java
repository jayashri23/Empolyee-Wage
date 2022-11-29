package com.emplyeewage;

import java.util.Random;

public class CheckEmpPresentOrAbsent {
    public static void main(String[] args) {

        Random rand = new Random();
        int check = rand.nextInt(2);
        if (check == 1) {
            System.out.println("Employee is Present");
        } else
            System.out.println("Employee is Absent");
    }
}
