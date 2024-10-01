package Generics;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 (Wrapper) 클래스
        // int, double, float, char..
        // 기본 자로형을 객체형태로 만들어 사용할 수 있게 해주는 클래스

        Integer i = 1; // int i = 1;
        Double d = 1.0; // double d = 1.0;
        Character c = 'C'; // char c = 'c';

        // 기본 자료형과 그렇게 차이를 못 느낌
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("----------------------");
        // 메소드 사용해보기

        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());

        System.out.println("----------------------------");
        String s = i.toString();
        System.out.println(s);

    }
}
