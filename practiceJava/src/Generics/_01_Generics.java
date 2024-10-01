package Generics;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭
        // 클래스나 메소드, 인터페이스를 정의하는 방법

        //int[] iArray = {1, 2, 3, 4, 5};
        Integer[] iArray = {1, 2, 3, 4, 5};
        //double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        // 함수도 Wrapper 타입으로 바꿔줘야한다.
        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("--------------------");
        // 기본 자로형은 제네릭스 함수로 바로 사용 하지 못한다.
        // Wrapper 클래스로 변경을 해서 사용해야 한다.
        // int -> Integer
        // double -> Double
        // float -> Float ....

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // 제네릭스
    // <T> 는 type T 말고 다른게 쓰고 싶으면 뒤에 파라미터도 바꿔주면 된다.
    public static <T> void printAnyArray(T[] array) {
        for(T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void printStringArray(String[] sArray) {
        for(String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void printDoubleArray(Double[] dArray) {
        for(double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void printIntArray(Integer[] iArray) {
        for(int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
