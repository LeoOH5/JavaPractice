package Method;

public class _01_Method {
    // 메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요 method입니다!");
    }

    public static void main(String[] args) {
        // 메소드 -> 다른 언어의 함수를 의미한다

        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");

    }
}
