package Class;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스)
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // int의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); // 0 이상 10 미만 정수형 값 반환
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 1.0 미만의 실수값 반환
        System.out.println("랜덤 실수 (범위) : " + random.nextDouble(10)); // 0.0 이상 10.0 미만 실수값 반환인듯
        // 원래는 실수형은 bound가 안돼서 꼼수를 사용했어야 한다.

        // 만약 5.0 이상 10.0 미만의 실수를 받고 싶다면
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (꼼수범위) : " + (min + (max - min) * random.nextDouble()));
        // (max - min) * random.nextDouble() 에서 0.0 ~ 5.0 값이 나오고
        // min을 더해줌으로서 5.0 에서 10.0이 나온다.
        // 현재는 기능이 추가 돼서 필요 없지만 이런 방법도 있다.


    }
}
