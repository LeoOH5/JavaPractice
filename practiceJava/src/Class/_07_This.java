package Class;

public class _07_This {
    public static void main(String[] args) {
        BlackBox box1 = new BlackBox();
        box1.modelName = "까망이";  // 까망이(최신형) 으로 변경하고 싶음

        // 에러가 났을 때는 옵션 + 엔터로 수정가능
        // this. 을 붙이면 인스턴스 변수로 인식한다
        // BlackBox 클래스 참고
        box1.appendModelName("(최신형)");
        System.out.println(box1.modelName);
    }
}
