package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число!!!");
        int range = 100;
        int number = (int)(Math.random() * range); //(1)
        System.out.println("Угадайте число от 0 до " + range);
        while (true){
            int input_number = scanner.nextInt(); // (2)
            if(input_number == number){                     // 1
                System.out.println("Вы угадали!");
                break;
            }else if(input_number > number){
                System.out.println("Загаданное число меньше.Попробуйте ещё раз."); // 2
            }
            else{
                System.out.println("Загаданное число больше.Попробуйте ещё раз."); // 3
            }
        }
        scanner.close();
    }
}
//
/* (1).Чтобы понять,как этот код работает на понять,что
Math.random() принимает диапазон от [0;1) ( то есть 1 не включительна)
И для того,чтобы нам увеличть диапазон от 0 до 100,мы должны Math.random() умножить на какое-либо число,
в нашем случае,это цифра 100,тогда наш диапазон будет принимать вид [0;100).

(2).Затем,когда рандомное число у нас появилось,то программа выполняет условие и сверяет,правильное ли мы число выбрали
или нет.
Например,мы ввели переменную int input_number мы присваем этой переменной метод nextInt() (nextInt() нужен для того,
чтобы пользователь мог ввести любое целое число,а программа при этом примит это и выведет ответ,какое именно число он
ввёл)

 Затем когда у нас есть какое-то рандомное число,а пользователь ввёл цифру,которую только ввёл пользователь,то правильн-
 нашего числа проверяется нашими условиями.Если мы угадали число,допустим 50,то выполняется условие под цифрой 1 ,если
 мы ввели число меньше,то у нас выполнится условие под цифрой 2 , а если мы ввели число больше нужного,то выполянется
 условие под цифрой 3.
 */

//