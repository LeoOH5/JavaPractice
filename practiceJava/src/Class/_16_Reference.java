package Class;

import Class.Camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 ( Primitive Data Types ) : int, float, double, long boolean ...
        // 소문자로 시작하고 데이터 초기호를 안하면 0인 데이터타입
        // .을 찍고 확인해보면 메소드가 없다
        int [] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 ( Non - Primitive, Reference Data Types ) : String, Camera ....
        // 데이터를 초기화 안하면 null 값
        // .을 찍고 확인해보면 메소드 존재
        String[] s = new String[3];
        System.out.println(s[0]); // null

        System.out.println("------------------------------");

        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);

        b = a;
        System.out.println(a);
        System.out.println(b);

        b= 30;
        System.out.println(a);
        System.out.println(b);
        // a랑 b는 전혀 상관없음

        System.out.println("------------------------------");

        Camera camera1 = new Camera(); // 새로운 메모리에 camera1이 참조한 것이기 때문에 camera1 = camera2를 하면 둘은 참조 관계가 된다.
        Camera camera2 = new Camera();

        camera1.name = "카메라1";
        camera2.name = "카메라2";

        System.out.println(camera1.name);
        System.out.println(camera2.name);

        camera2 = camera1;
        System.out.println(camera1.name);
        System.out.println(camera2.name);

        camera2.name = "고장난 카메라";
        System.out.println(camera1.name);
        System.out.println(camera2.name);
        // camera1 과 camera2는 참조관계이다.

        System.out.println("------------------------------");
        ChangeName(camera2); // 카메라2 --> 카메라1 을 참조한 상황에서 카메라2의 이름을 바꿔 카메라1의 이름이 바뀐다.
        System.out.println(camera1.name);
        System.out.println(camera2.name);

        // 참조 관계를 끊고 싶으면 null 값을 넣기
        camera2 = null;

    }
    public static void ChangeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
