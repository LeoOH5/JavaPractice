package Class;

import Class.Camera.Camera;
import Class.Camera.FactoryCam;
import Class.Camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        // 하나의 부모한테만 상속을 받을 수 있다.
        // 다이아몬드 상속 문제가 생길일은 없다.
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

    }
}
