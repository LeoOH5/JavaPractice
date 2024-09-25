package Method;

public class _04_ParameterAndReturn {
//    public static void square(int num) {
//        int result = num * num;
//        System.out.println(result);
//    }
    public static int getSquare(int num){
       return num * num;
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
        int value = getSquare(2);
        System.out.println(value); // 2*2 = 4

        value = getSquare(getSquare(3));
        System.out.println(value); // 2*2 = 4

    }
}
