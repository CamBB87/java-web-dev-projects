package org.launchcode;
import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a radius: ");
        double rad = input.nextInt();
        double area = Circle.calc(rad);
        System.out.println(area);
    }


}

