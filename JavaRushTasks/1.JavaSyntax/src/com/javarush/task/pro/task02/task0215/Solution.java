package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int arithmeticalMean = (number1 + number2 + number3) / 3;

        System.out.println(arithmeticalMean);
        scanner.close();
    }
}