package main.java.com.ohgiraffers.section01.method;

public class Application05 {
    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        calculator cal = new calculator();
        int min = cal.minNumberOf(first,second);
        System.out.println(min);

        int max = calculator.maxNumberOf(first,second);
        System.out.println(max);

    }
}
