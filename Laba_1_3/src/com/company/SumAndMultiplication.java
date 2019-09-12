package com.company;
import java.util.Scanner;

public class SumAndMultiplication {

    void operations() {

        int sum = 0;
        int mul=1;
        int digit;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите числа: ");
        String numders = sc.nextLine();
        var str =numders.split(" ");

        for (int i = 0; i < str.length; i++) {
            digit = Integer.parseInt(str[i]);
            sum += digit;
        }
        System.out.println("Сумма чисел: "+ sum);


        for (int i = 0; i < str.length; i++) {
            digit = Integer.parseInt(str[i]);
            mul *= digit;
        }
        System.out.println("Произведение чисел: "+ mul);
    }
}