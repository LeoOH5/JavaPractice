package Class.Camera;

public class FactoryCam extends Camera  { // 자식 클래스

    public FactoryCam() {
        this.name = "공장 카메라";
    }

    public void recordVideo() {
        super.recordVideo(); // 부모 클래스의 내용을 쓰면서 일부 내용 추가
        detectFire();
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }


    public void showMainFeature() {
        System.out.println(this.name + "의 주요기능 : 화재 감지" );
    }
}
