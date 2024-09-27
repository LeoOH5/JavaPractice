package Class;

public class BlackBox {
    // 기본적으로는 인스턴스 변수
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color;// 색상

    int serialNumber; // 시리얼 번호
    static int counter = 0; // 시리얼 번호를 생성해주는 역할 점점 1씩 올라갈 예정
    static boolean canAutoReport = false; // 자동 신고기
    // static은 클래스 변수 => 클래스 내에 똑같이 적용

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급 받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
        this(); // 기본 생성자 호출 -> 시리얼번호를 위해
        // 안에 자료형 타입을 맞춰서 값을 넣어주면 정의된 생성자가 호출된다.

        System.out.println("사용자 정의 생성자 호출");

        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;

    }


    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지 되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 작동되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입 되었습니다");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    // showDateTime = 날짜정보 표시여부
    // showSpeed = 속도정보 표시여부
    // min = 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("시스템 녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
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

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getModelName() {
        return modelName;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) { // isEmpty() 는 "" 빈문자열을 의미 빈문자열은 true이다.
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setPrice(int price) {
        if(price < 10000){
            this.price = 100000;
        }else {
            this.price = price;
        }
    }

    int getPrice() {
        return price;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }
}
