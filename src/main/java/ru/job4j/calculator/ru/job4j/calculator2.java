package ru.job4j.calculator.ru.job4j;

public class calculator2 {
    public static void plus (int first, int second){
        int result = first + second;
        System.out.println(result);
    }

    public static void main (String[] args){
        calculator2.plus(1,1);
        calculator2.plus(100,200);
    }
}
