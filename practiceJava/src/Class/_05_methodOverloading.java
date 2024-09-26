package Class;

public class _05_methodOverloading {
    public static void main(String[] args) {
        BlackBox box1 = new BlackBox();
        box1.modelName = "까망이";



        box1.record(true, true, 30);
        System.out.println("-----------------------------------------");
        box1.record(false, true, 20);
        System.out.println("-----------------------------------------");
        box1.record(true, false, 10);
        System.out.println("-----------------------------------------");
        box1.record();

        //String
        String s = "BlackBox";
        System.out.println(s.indexOf("a")); // command + indexOf 클릭 / window는 cnontrol?
        // methodOverloading 확인가능 자주 사용하니 잘 익혀두기

    }
}
