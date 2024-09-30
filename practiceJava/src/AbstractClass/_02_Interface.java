package AbstractClass;

import AbstractClass.Camera.Factorycam;
import AbstractClass.Detector.AdvancedFireDetector;
import AbstractClass.Detector.Detectable;
import AbstractClass.Detector.FireDetector;
import AbstractClass.Reporter.*; // 패키지 내에 전체 import

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스 ( 뼈대만 제공)
        // 단일상속 (extands) 하나만 상속 받을 수 있으나 인터페이스를 통해 보안 가능
        // 인터페이스 안에서 정의된 함수는 앞에 public abstract가 포함된다. 생략하면 된다.

        // FactoryCam을 보면 알 수 있다.

        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        Factorycam factorycam = new Factorycam();
        factorycam.setDetector(fireDetector);
        factorycam.setReporter(normalReporter);

        factorycam.detect();
        factorycam.report();

    }
}
