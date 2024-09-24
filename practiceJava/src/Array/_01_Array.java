package Array;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 = 같은 자료형의 값을 여러개를 저장하는 연속된 공간
        String coffeeRoss = "americano";
        String coffeeRachel = "cafeMoca";
        String coffeeChandler = "latte";
        String coffeeLuna = "ade";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeLuna + " 하나");
        System.out.println("주세요");

        // ----------------------------------------

        // 배열 선언 첫 번째 방법
        String[] coffee1 = new String[4];

        // 배열 선언 두 번째 방법
        String coffee2[] = new String[4];

        // 배열은 0부터 시작
        coffee1[0] = "아메리카노";
        coffee1[1] = "카페모카";
        coffee1[2] = "라떼";
        coffee1[3] = "에이";

        // 배열 선언 세 번째 방법
        String[] coffee3 = new String[] {"아메리카노", "카페모카", "라떼", "에이드"};

        // 배열 선언 네 번째 방법
        String[] coffee4 = {"아메리카노", "카페모카", "라떼", "에이드"};

        // 커피 주문
        System.out.println("--------------------------------");
        System.out.println(coffee3[0] + " 하나");
        System.out.println(coffee3[1] + " 하나");

        coffee3[2] = "에스프레소"; // 배열의 값 변경

        System.out.println(coffee3[2] + " 하나");
        System.out.println(coffee3[3] + " 하나");
        System.out.println("주세요");

        // String 말고도 다른 자료형도 다 가능하다
    }
}
