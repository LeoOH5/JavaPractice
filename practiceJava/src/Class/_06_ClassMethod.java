package Class;

public class _06_ClassMethod {
    public static void main(String[] args) {
        // static이 붙은 클래스 메소드는 내부가 다 똑같이 동작한다.
        BlackBox box1 = new BlackBox();
        box1.callServiceCenter();

        BlackBox box2 = new BlackBox();
        box2.callServiceCenter();

        BlackBox.callServiceCenter();

        // 클래스 메소드에서는 클래스 변수에만 접근 가능 메소드 변수에는 접근 못한다
        // BlackBox 클래스 참고
    }
}
