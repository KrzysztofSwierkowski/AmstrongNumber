package com.company;

import java.util.Scanner;

public class Main {

    public static boolean Narcistic(int nNumb){
        int numberCompare,numberPow,result = 0;
        numberCompare = nNumb;
        while (numberCompare !=0){
            numberPow = numberCompare % 10;
            result += Math.pow(numberPow,3);
            numberCompare /= 10;
        }
        return result == nNumb;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();


        if(Narcistic(number)){
            System.out.printf("Number %d is Amstrong number %n",number);
        }
        System.out.println("Amstrong numbers in range: (Max 1000)");
        for (int i = 2; i < number ; i++){

            if (Narcistic(i)) {
                System.out.printf("%d is Amstrong number %n", i);
            }
        }

    }
}
