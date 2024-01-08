package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter how many miles you have traveled: ");
        int miles = input.nextInt();
        System.out.println("please enter how many gallons of gas you have consumed: ");
        int gas = input.nextInt();
        int answer = miles / gas;
        System.out.println(answer + " was the miles per gallon you got.");





    }

}
