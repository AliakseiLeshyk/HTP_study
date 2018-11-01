// Домашнее задание 1
public class Hometask_1 {
    public static void main(String[] args) {

        // Task_1
        double my_mass, moon_gravitation, my_moon_mass;
        my_mass = 70; //мой вес на Земле
        moon_gravitation = 0.16; //% силы тяжести Луны от Земного
        my_moon_mass = my_mass * moon_gravitation; //мой вес на Луне
        System.out.println(" Задание 1: " + " Мой вес на Луне равен " + my_moon_mass + " кг ");
        System.out.println("");


        // Task_2
        double myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double c1 = myArray[0] + myArray[0]*0.1;
        double c2 = myArray[1] + myArray[1]*0.1;
        double c3 = myArray[2] + myArray[2]*0.1;
        double c4 = myArray[3] + myArray[3]*0.1;
        double c5 = myArray[4] + myArray[4]*0.1;
        double c6 = myArray[5] + myArray[5]*0.1;
        double c7 = myArray[6] + myArray[6]*0.1;
        double c8 = myArray[7] + myArray[7]*0.1;
        double c9 = myArray[8] + myArray[8]*0.1;
        System.out.println(" Задание 2: " + " Элементы массива умноженные на 10% - " + c1 + "; " + c2 + "; " + c3 + "; " + c4 + "; " + c5 + "; " + c6 + "; " + c7+ "; " + c8 + "; " + c9);
        System.out.println("");

        //Task_3
        System.out.println(" Задание 3: ");
        int r,sum=0,temper;
        int n=454;
        temper=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temper==sum)
            System.out.println("Чсло является палиндромом");
        else
            System.out.println("Чсло не является палиндромом");
        System.out.println("");



        //Task_4
        int x;
        for (x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.println(" Задание 4: " + x);
            }
        }
        System.out.println(" ");


        //Task_5
        int y;
        for (y = 1; y <= 15; y++) {
            if (y % 2 != 0) {
                System.out.println(" Задание 5: " + y);
            }
        }
        System.out.println(" ");


        //Task_6
        int z;
        for (z = 2; z <= 100; z = z + 2) {
            System.out.println(" Задание 6: " + z);
        }
        System.out.println(" ");


        //Task_7
        int summ = 0;
        int num;
        for (num = 20; num <= 200; num++) {
            summ += num;
        }
        System.out.println(" Задание 7: " + "Сумма чисел от 20 до 200 равна " + summ);
        System.out.println(" ");


        //Task_8:
        int month;
        System.out.println(" Задание 8: ");
        for (month = 1; month <= 12; month++) {
            if (month == 1) System.out.println(month + " January");
            else if (month == 2) System.out.println(month + " February");
            else if (month == 3) System.out.println(month + " March");
            else if (month == 4) System.out.println(month + " April");
            else if (month == 5) System.out.println(month + " May");
            else if (month == 6) System.out.println(month + " June");
            else if (month == 7) System.out.println(month + " July");
            else if (month == 8) System.out.println(month + " August");
            else if (month == 9) System.out.println(month + " September");
            else if (month == 10) System.out.println(month + " October");
            else if (month == 11) System.out.println(month + " November");
            else if (month == 12) System.out.println(month + " December");
        }
        System.out.println(" ");


        //Task_9
        int value1 = 10;
        int value2 = 20;
        int temp = value1;
        value1 = value2;
        value2 = temp;
        System.out.println(" Задание 9: " + " Переменная 1 равна - " + value1 + "; " + "переменная 2 равна - " + value2);
        System.out.println(" ");


        //Task_10
        int firtval = 15;
        int secondval = 30;
        int thirdval = firtval + secondval;
        System.out.println(" Задание 10:" + " Сумма 15 и 30 равна " + thirdval);
        System.out.println(" ");


        //Task_11
        int q = 3;
        int w = 5;
        int e = 7;
        int max;
        for (max = w; max < e; ) {
            max = e;
            if (max < q) {
                max = q;
            }
            System.out.println(" Задание 11: " + " Максимальное число равно " + max);
        }
        System.out.println(" ");


        //Task_12
        boolean val1 = true;
        boolean val2 = false;
        System.out.println(" Задание 12: " + " истина= " + val1 + "; " + " ложь= " + val2);
        System.out.println(" ");


        //Task_13
        String word1 = "Hello,";
        String word2 = " world!";
        String sentence = word1 + word2;
        System.out.println(" Задание 13: " + sentence);
        System.out.println(" ");


        //Task_14
        int number1 = 20;
        int number2 = 23;
        System.out.println(" Задание 14: ");
        if (number1 > number2) {
            number1 = number1 * 3;
            System.out.println(" Первое число равно " + number1 + "; " + " второе число равно " + number2);
        }
        if (number1 < number2) {
            number2 = number2 * 8;
            System.out.println(" Первое число равно " + number1 + "; " + " второе число равно " + number2);
        }
        System.out.println(" ");

        //Task_15
        System.out.println(" Задание 15: ");
        int vl;
        for (vl = 1; vl <= 100; vl++) {
            System.out.println(" Методом For: " + vl);
        }
        System.out.println(" ");
        int vl1 = 0;
        while (vl1 < 100) {
            vl1++;
            System.out.println(" Методом While: " + vl1);
        }
        System.out.println(" ");
        int vl2 = 0;
        do {
            vl2++;
            System.out.println(" Методом Do while: " + vl2);
        }while (vl2 < 100);
        System.out.println(" ");



        //Task_16
        System.out.print(" Задание 16: " + " Числа от 3 до 99 с шагом 3: ");
        int step;
        for (step = 3; step <= 99; step +=3){
            System.out.print(step + " ");
        }
        System.out.println(" ");



        //Task_17
        System.out.println(" Задание 17:");
        double [] myMassiv = {2.5, 3.7, 4.3, 5.5, 6.7, 7.2, 8.5, 9.7};
        double big = Double.MIN_VALUE;
        for (int m = 0; m < myMassiv.length; m++){
            big = Math.max(big, myMassiv[m]);
        }
        double a1 = myMassiv[0]/big;
        double a2 = myMassiv[1]/big;
        double a3 = myMassiv[2]/big;
        double a4 = myMassiv[3]/big;
        double a5 = myMassiv[4]/big;
        double a6 = myMassiv[5]/big;
        double a7 = myMassiv[6]/big;
        double a8 = myMassiv[7]/big;
        System.out.println(" Деление элементов массива на наибольшее = " + a1 + "; " + a2 + "; " + a3 + "; " + a4 + "; " + a5 + "; " + a6 + "; " + a7 + "; " + a8);
        System.out.println(" ");



        //Task_18
        System.out.println(" Задание 18: ");
        double byr;
        double dollar;
        double rate;
        byr = 1375;
        rate = 2.2;
        dollar = byr/rate;
        System.out.println(" С учетом обменного курса, операция составила " + dollar + "$");

    }



}
