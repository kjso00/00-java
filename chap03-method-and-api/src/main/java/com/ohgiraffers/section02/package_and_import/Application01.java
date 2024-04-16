package main.java.com.ohgiraffers.section02.package_and_import;

import static main.java.com.ohgiraffers.section01.method.calculator.maxNumberOf;
public class Application01 {
//import- 불러오기
// import static- 스태틱 메모리에 있는 함수를 불러옴
    public static void main(String[] args) {
        int first = 200;
        int second = 300;
        main.java.com.ohgiraffers.section01.method.calculator cal = new main.java.com.ohgiraffers.section01.method.calculator();
        int max = maxNumberOf(first, second);
        System.out.println(max);
    }
}
