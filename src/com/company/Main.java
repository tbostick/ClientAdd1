package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
       num = (num + 5);
       num = (num * 2);
       num = (num - 7);
        System.out.println("The result of the calculation is :  ");
        System.out.println(num);
    }
}
