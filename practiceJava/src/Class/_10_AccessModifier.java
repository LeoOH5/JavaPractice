package Class;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 접근 제어자
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지 않았을 때) 같은 패키지 안에서만 접근 가능 ( 폴더 )
        // protected : 같은 패키지 내에서 접근 가능 다른 패키지인 경우 자식 클래스에서 접근 가능

        // 클래스도 접근 제어자를 통해 다른 패키지에서 접근 못하게 정의 가능


        BlackBoxRefurbish box1 = new BlackBoxRefurbish();
        box1.setModelName("까망이");
        box1.setPrice(-1000);
        box1.setColor("Black");

        System.out.println(box1.getModelName());
        System.out.println(box1.getPrice());
        System.out.println(box1.getResolution());
    }
}
