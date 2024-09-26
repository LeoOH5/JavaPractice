package Class;

public class BlackBox {
    // 기본적으로는 인스턴스 변수
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color;// 색상

    static boolean canAutoReport = false; // 자동 신고기
    // static은 클래스 변수 => 클래스 내에 똑같이 적용

    void autoReport() {
        if(canAutoReport) {
            System.out.println("충돌이 감지 되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 작동되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입 되었습니다");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    // showDateTime = 날짜정보 표시여부
    // showSpeed = 속도정보 표시여부
    // min = 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("시스템 녹화를 시작합니다.");
        if(showDateTime){
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if(showSpeed){
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상이 " + min + " 단위로 표시됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    // static이 붙은 클래스 메소드는 내부가 다 똑같이 동작한다.
    static void callServiceCenter() {
        System.out.println("서비스센터로 연결합니다.");

        // modelName = "test"; 인스턴스 변수는 클래스 함수에서 접근 못한다
        canAutoReport = true;  // 클래스 변수에는 접근 가능
    }

    public void appendModelName(String modelName) {
        this.modelName += modelName; // this. 을 붙이면 인스턴스 변수가 된다
        // 뒤에 있는 modelName은 파라미터

    }
}
