package Class;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox box1 = new BlackBox();
        box1.modelName = "asd";

        box1.autoReport();

        BlackBox.canAutoReport = true;
        box1.autoReport();

        box1.insertMemoryCard(32);
    }
}
