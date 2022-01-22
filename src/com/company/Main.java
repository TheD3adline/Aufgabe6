package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float weight;
        float height;
        float bmi;

        System.out.println("Body Mass Index - Rechner");
        System.out.println("Bitte geben Sie Ihr Koerpergewicht in Kilogramm ein:");
        weight = sc.nextFloat();
        System.out.println("Bitte geben Sie jetzt Ihre Koerpergroesse in Metern ein:");
        height = sc.nextFloat();
        bmi = weight / (height * height);
        System.out.println("Ihr Body Mass Index ist: " + bmi);


    }
}
