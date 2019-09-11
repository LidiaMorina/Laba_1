package com.company;
import java.util.Scanner;

public class Password {
    //исходный пароль, строка-образец
    String password = "qwerty";
    //пароль для проверки
    String newPassword;

    //метод сверки паролей
    void checkPassword() {
        System.out.println("Введите пароль: ");
        Scanner enterPas = new Scanner(System.in);
        newPassword = enterPas.nextLine();
        if (password.equals(newPassword))
            System.out.println("Пароль введён корректно");
        else
            System.out.println("Ошибка, пароль введён неверно");
    }

}
