/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Date;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your current age?");
        int age = input.nextInt();
        System.out.println("At what age would you like to retire?");
        int retireAge = input.nextInt();
        int yearsLeft = retireAge - age;
        Date today = new Date();
        int year = today.getYear() + 1900;
        int retirementYear = year + yearsLeft;
        System.out.println("You have " + yearsLeft + " years left until you can retire."
                            + '\n' + "It's " + year + ", so you can retire in " + retirementYear);
    }
}
