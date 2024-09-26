package Class;

public class _02_InstanceVariable {
    public static void main(String[] args) {
        BlackBox box1 = new BlackBox();
        box1.modelName = "까망이";
        box1.resolution = "FHD";
        box1.price = 200000;
        box1.color = "Black";

        System.out.println(box1.modelName);
        System.out.println(box1.resolution);
        System.out.println(box1.price);
        System.out.println(box1.color);
    }
}
