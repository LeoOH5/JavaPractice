package Class;

import Class.Camera.FactoryCam;
import Class.Camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // 슈퍼 오버라이딩을 하지만 새로 덮어 씌우는 것이 아닌
        // 부모 클래스의 메소드를 사용하면서 내용 추가

        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("------------------");
        speedCam.takePicture();
    }
}
