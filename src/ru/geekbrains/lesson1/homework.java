package ru.geekbrains.lesson1;

public class Main {

    public static void main(String[] args) {
        //Создать переменные всех пройденных типов данных, и инициализировать их значения
        byte b = 127;
        short st = 12419;
        char ch = 'A';
        int integer = 24;
        long lg = 124124L;
        float fl = 12.345949f;
        double dl = 4323.45345;
        boolean bool = true;

    }
    // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода
    public static int calc(int a, int b, int c, int d){
        return a * (b + (c /d));
    }
    // Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false;
    public  static boolean range(int one,int two){
        int sum = one + two;
        return sum > 9 && sum < 21;
    }
    // Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали,
    // или отрицательное; Замечание: ноль считаем положительным числом.
    public static void isPositiveOrNegative(int num){
        if (num > -1){
            System.out.println("Положительное");
        }
        else {
            (num < 0)
            System.out.println("Отрицательное");
        }
    }
    // Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean isNegative(int neg){
        return neg < 0;

    }
    // Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void greetings(String name){
        System.out.printf("Привет", name);
    }
    //Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean year(int year) {
        return year % 100 != 0 && year % 4 == 0 || year % 400 == 0;
    }
}
