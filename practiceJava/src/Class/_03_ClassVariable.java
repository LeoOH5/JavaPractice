package Class;

public class _03_ClassVariable {
    public static void main(String[] args) {
        BlackBox box1 = new BlackBox();
        box1.modelName = "까망이";
        System.out.println(box1.modelName);

        BlackBox box2 = new BlackBox();
        box2.modelName = "하양이";
        System.out.println(box2.modelName);


        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기 개발 여부
        System.out.println("개발 전");
        System.out.println(box1.modelName + " 자동 신고 기능 " + box1.canAutoReport);
        System.out.println(box2.modelName + " 자동 신고 기능 " + box2.canAutoReport);
        System.out.println("모든 블랙바스 제품 자동 신고 기능 " + BlackBox.canAutoReport);

        // 기능 개발
        BlackBox.canAutoReport = true;

        System.out.println("개발 후 ");
        System.out.println(box1.modelName + " 자동 신고 기능 " + box1.canAutoReport);
        System.out.println(box2.modelName + " 자동 신고 기능 " + box2.canAutoReport);
        System.out.println("모든 블랙바스 제품 자동 신고 기능 " + BlackBox.canAutoReport);


    }
}
