package base;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Kenny Dao
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("What is the length of the room in feet?");
        Scanner len = new Scanner(System.in);
        double length = len.nextDouble();

        System.out.println("What is the width of the room in feet?");
        Scanner wid = new Scanner(System.in);
        double width = wid.nextDouble();

        System.out.println("You entered dimension of " + length + " by " + width + " feet.");

        double area = length * width;
        double conv = area * 0.09290304;

        System.out.println("The area is");
        System.out.println(area+" square feet.");
        System.out.println(conv + " square meters.");
    }
}