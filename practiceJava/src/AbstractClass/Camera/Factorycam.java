package AbstractClass.Camera;

import AbstractClass.Detector.Detectable;
import AbstractClass.Reporter.Reportable;

public class Factorycam extends Camera implements Detectable, Reportable {
    private Detectable detector; // 두 개의 인터페이스를 선언
    private Reportable reporter;


    // 세터를 이용해서 외부에서 어떤 리포터와 디텍터를 사용할지 받고
    // 신고와 감지 기능을 사용
    // 새로운 옵션이 생기면 외부에서 받는 값만 바꾸거나 함수만 변경하면 되는 장점이 있음
    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    @Override // 추상함수 완성 시켜야지 상속 받을 수 있다.
    public void showMainFeature() {
        System.out.println("화재 감지");
    }


    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
