package Generics;

import Generics.coffee.*;
import Generics.user.User;
import Generics.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeByNumber coffee = new CoffeByNumber(10);
        coffee.ready();

        CoffeByNickname coffee2 = new CoffeByNickname("카리나");
        coffee2.ready();

        System.out.println("----------------------------");

        CoffeeByName coffee3 = new CoffeeByName("윈터");
        coffee3.ready();

        CoffeeByName coffee4 = new CoffeeByName(14);
        coffee4.ready();

        System.out.println("----------------------------");
        int c4 = (int) coffee4.name; // Object 타입이어서 int로 형변환을 해주어야한다.
        String c3 = (String) coffee3.name; // Object 타입이어서 String으로 형변환 해주어야한다.

        System.out.println("주문 고객 번호 : " + c4);
        System.out.println("주문 고객 이름 : " + c3);

        // 위처럼 오브젝트 타입으로 받으면 항상 형변환이 필요
        // 그래서 제네릭스 클래스를 이용하면 간편해진다.

        System.out.println("----------------------------");
        // 제네릭 클래스 사용방법
        // <> 안에 사용할 타입을 Wrapper 클래스 형식으로 입력 해주어야한다.
        // new 뒤에도 <> 있는 거 까먹지 않긔

        Coffee<Integer> c5 = new Coffee<>(100);
        c5.ready();
        // 제네릭에서는 타입형을 지정해줘서 따로 형변환없이 사용가능하다.
        int c5Name = c5.name;

        // String은 참조 데이터 타입이지 Wrapper 클래스는 아니다.
        Coffee<String> c6 = new Coffee<>("지젤");
        c6.ready();

        System.out.println("----------------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("닝닝"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("이수만"));
        c8.ready();

        System.out.println("----------------------------");
        coffeOrder("오정빈");
        coffeOrder("오정빈" , 5);


    }

    public static <T> void coffeOrder(T name) {
        System.out.println(name + "님 준비 완료 ");
    }
    // 2개 이상 제네릭타입을 사용하고 싶으면 콤마로 해서 다른 변수로 지정해주면 된다.
    public static <T, V> void coffeOrder(T name ,V num ) {
        System.out.println(num + " 주문번호  준비 완료 " + name);
    }
}
