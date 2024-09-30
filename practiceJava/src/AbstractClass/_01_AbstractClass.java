package AbstractClass;

import AbstractClass.Camera.Camera;
import AbstractClass.Camera.Factorycam;
import AbstractClass.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 ( 아직 완성되지 않은 클래스)
        // 추상 메소드 ( 추상 클래스 또는 인터페이스에서만 사용가능, 껍데기만 있는 메소드)

        // Camera camera = new Camera();
        // Class 앞에 abstract가 붙어 아직 완성되지 않은 클래스여서 선언 불가
        // 내용을 보면 부족함은 없으나 abstract 때문
        // 따라서 Class 직접 선언 못하게 막기 위한 용도로도 사용가능하다.

        // 추상클래스는 선언 불가 추상클래스를 상속한 자식클래스로 선언 가능
        // 추상함수가 존재하면 오버라이딩을 해야 상속 받을 수 있다.
        Factorycam factorycam = new Factorycam();
        factorycam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
