package com.htp;

//Надеюсь, я правильно понял условие задачи :)
public class Hometask_1_Advance {
    public static void main(String[] args) {
        System.out.println(" Программа для подсчеты колическтва часов, минут и секунд в n-ном количестве суток: ");
        int days; //Значение days может меняться пользователем.
        int hours;
        int minutes;
        int seconds;
        days = 13; //Для примера количество суток, которые отрабатывает врач анестезиолог-реаниматолог за месяц на 1,5 ставки
        hours = 24 * days; //Подсчет часов
        minutes = 24 * 60 * days; //Подсчет минут
        seconds = 24 * 60 * 60 * days; //Подсчет секунд
        System.out.println(" Работая на 1,5 ставки в месяц (13 суток), врач анестезиолог-реаниматолог отрабатывает: " + hours + " часов, " +
                 minutes + " минут, " + seconds + " секунд.");


    }



}
