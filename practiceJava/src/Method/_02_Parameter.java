package Method;

public class _02_Parameter {
    // Parameter , 매개변수
    public static void square(int num) {
        int result = num * num;
        System.out.println(result);
    }
    public static void powerExp(int num, int exponent) {
        int reuslt = 1;
        for (int i = 0; i < exponent; i++) {
            reuslt *= num;
        }
        System.out.println(num +"의 " + exponent + "승은 " + reuslt);
    }

    public static void main(String[] args) {
        // 파라미터 = 전달값

        // Argument, 인수
        square(4);

        powerExp(3,2);
    }
}
