package Class;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox box1 = new BlackBox();
        box1.setModelName("까망이");
        box1.setPrice(-1000);
        box1.setColor("Black");

        System.out.println(box1.getModelName());
        System.out.println(box1.getPrice());
        System.out.println(box1.getResolution());
    }
}
