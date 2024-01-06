package com.jee.practice.chap4.looping;

import java.util.Scanner;

public class RevisionWhileStatement {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("input a number : ");
        int num = sc.nextInt();

        int i = 0; int sum = 0;

        while (i < num) { // sum = sum + i
//            System.out.println(i); // if want to print one by one
//            sum = sum + i;
            ++i;
        System.out.println(i); // if want to print in all
        }
    }
}
