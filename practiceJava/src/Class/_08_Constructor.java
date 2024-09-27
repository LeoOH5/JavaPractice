package Class;

public class _08_Constructor {
    public static void main(String[] args) {
        // 생성자 = 클래스 생성시 자동으로 호출 되는 메소드
        // 생성자도 메소드 오버로딩 가능하다.
        BlackBox box1 = new BlackBox();
        box1.modelName = "까망이";
        box1.resolution = "FHD";
        box1.price = 200000;
        box1.color = "Black";

        BlackBox box2 = new BlackBox("하양이", "FHD", 10000, "White");
        System.out.println(box2.modelName);
        System.out.println(box2.resolution);
        System.out.println(box2.price);
        System.out.println(box2.color);
        System.out.println(box2.serialNumber);

    }
}
