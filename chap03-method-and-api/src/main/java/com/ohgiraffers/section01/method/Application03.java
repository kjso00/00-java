package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        //String ch ='준';
        int a = 25;
        //char b ="남자";

        Application03 app1 = new Application03();  //객체 생성


        int result =app1.plus(x,y);
        System.out.println(result);


    }

    // 두 수를 더하는 함수
    // 접근제어자  반환 타입  함수명(매개변수){}   //접근제어자, 반환타입 , 함수이름, (매개변수), { 함수기능 }
    public int plus(int x, int y){
        int result = x+y;
        return result;
    }

    /*
    * myinfo함수를 만들고
    * 이름 : 문자열
    * 나이 : 정수
    * 성별 : 문자
    * 전화번호 : '-'을 포함한 전화번호
    *
    * 위 4개의 자료형을 매개변수로 받아 하나의 문자열로 더하고 main에서 출력해주세요
    **/

    // 1.myinfo 함수 만들기
    // 2.매개변수 (String name, int age, char gender, String phone)
    // 3.매개변수 더하기 String result = name + age gender + phone
    // 4.return result

    public String myInfo(String name, int age, char gender, String phone){
        String result = name + age + gender + phone;
        return result;

}

    }


