package com.java.conditionals;
import java.util.*;

public class DayActivities {
    public static void main(String[] args) {
        int Day;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the day(1 for Monday, 2 for Tuesday, ..., 7 for Sunday):");
        Day = obj.nextInt();
            switch (Day) {
                case 1:
                    System.out.println("Monday: Gym");
                    break;
                case 2:
                    System.out.println("Tuesday: Yoga");
                    break;
                case 3:
                    System.out.println("wednesday: swimming");
                    break;
                case 4:
                    System.out.println("Thursday: Reading");
                    break;
                case 5:
                    System.out.println("Friday: Movies");
                    break;
                case 6:
                    System.out.println("saturday: Hiking");
                    break;
                case 7:
                    System.out.println("Sunday: Rest");
                    break;
                default:
                    System.out.println("Unexpected value:" + Day);
            }
    }
}