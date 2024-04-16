package main.java.com.ohgiraffers.section01.method;

import java.net.SocketOption;

public class Application01 {
        public static void main(String[] args) {
            /*
            * 메소드
            * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
             */

            System.out.println("main() 시작됨....");

            Application01 app1 = new Application01();
            app1.methodA();
            app1.methodB();   //methodB 함수를 사용하려고 호출했다

            System.out.println("main() 종료됨..");

        }
       // 모든 method는 return을 받아야 종료됨 but void형에서는 반환타입이 없어서 괜찮음

        public void  methodA() {
            System.out.println("methodA() 시작됨");
            methodB();
            System.out.println("methodA() 종료됨");
        }


        public void  methodB() {
                System.out.println("methodB() 시작됨");
                methodC();
                System.out.println("methodB() 종료됨");
        }

        public void methodC() {
            System.out.println("methodC() 시작됨");
            System.out.println("methodC() 종료됨");

        }
}

