package Class;

import Class.Camera.Camera;
import Class.Camera.FactoryCam;
import Class.Camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 오버라이딩 = 자식클래스에서 부모클래의 메소드 덮어 씌우기
        // 오버로딩 = 같음 이름의 메소드

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
