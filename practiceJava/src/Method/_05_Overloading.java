package Method;

public class _05_Overloading {
    // 파라미터가 int형 일 때 사용
    public static int getPower(int num) {
        int result = num * num ;
        return result;
    }

    // 파라미터가 String형 일 때 사용
    public static int getPower(String strNum) {
        int num = Integer.parseInt(strNum);
        int result = num * num;
        return result;
    }

    // 파라미터가 2개 일 때 사용
    public static int getPower(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩 ( 이름이 같은 메소드 여러개 존재 )

        // 1. 전달값 자료형이 다를 때
        // 2. 전달값 개수가 다를 때
        // 메소드 반환형은 상관없다 전달값만 신경씀

        System.out.println(getPower(5));
        System.out.println(getPower("12"));
        System.out.println(getPower(3,3));
    }
}
