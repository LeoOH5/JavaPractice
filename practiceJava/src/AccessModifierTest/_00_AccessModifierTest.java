package AccessModifierTest;

import Class.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish box1 = new BlackBoxRefurbish();
        box1.modelName = "까망이"; // public 이여서 접근 가능
        // box1.resolution = "FHD" // default 같은 패키지 안에서만 접근 가능
        // box1.price = 100000 // private 접근 불가
        // box1.color = "Black"; // protected 패키지가 다르고 패키지가 다르더라도 자식클래스면 가능하나 아직 상속을 안 받아 접근 불가능

    }
}
