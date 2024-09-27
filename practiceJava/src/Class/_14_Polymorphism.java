package Class;

import Class.Camera.Camera;
import Class.Camera.FactoryCam;
import Class.Camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // Class Person : 사람
        // Class Student extends Person : 학생 ( 학생은 사람이다 Student is a Person )
        // Class Teacher extends Person : 선생님 ( 선생님은 사람이다 Teacher is a Person )
        // 상속은 ( IS - A ) 관계

        // 아래부터 다형성

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
        // 메소드 오버라이딩 결과 그대로 나온다

        System.out.println("------------------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for ( Camera cam : cameras ) {
            cam.showMainFeature();
        }

        System.out.println("------------------------------");
        // factoryCam.detectFire();
        // speedCam.checkSpeed();
        // Camera 클래스로 생성 했기 떄문에 함수는 사용 못한다.

        // camera가 Camera로 만들어진 객체이면 true 반환
        if ( camera instanceof Camera) {
            System.out.println("카메라 입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire(); // 형변환을 해줘서 사용하기도 가능하다.
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }
    }
}
