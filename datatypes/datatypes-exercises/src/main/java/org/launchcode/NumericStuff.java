package org.launchcode;
import java.util.Scanner;
public class NumericStuff {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a width in feet: ");
        int width = input.nextInt();
        System.out.println("enter a height in feet: ");
        int height = input.nextInt();
        int area = width * height;
        System.out.println(area + " is the area of the thing");
    }
}
