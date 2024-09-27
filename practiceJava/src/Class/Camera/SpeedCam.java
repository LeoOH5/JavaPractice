package Class.Camera;

import java.util.SortedMap;

public class SpeedCam extends Camera{

    public SpeedCam() {
        this.name = "스피드 캠";
    }

    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        //  번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override
    public void showMainFeature() {
        System.out.println(this.name + "의 주요기능 : 속도 측정, 번호 인식" );
    }
}
