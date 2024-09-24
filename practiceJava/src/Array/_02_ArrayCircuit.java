package Array;

public class _02_ArrayCircuit {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffee = {"아메리카노", "카페모카", "라떼", "에이드"};

        for (int i = 0; i < 4; i++) {
            System.out.println(coffee[i]+ " 하나");
        }

        System.out.println("주세요");

        System.out.println("----------------------------------");

        // 배열의 길이를 이용한 순회
        // index 값을 이용할 때 사용
        String[] coffees = {"아메리카노", "카페모카", "라떼", "에이드"};

        for (int i = 0; i < coffee.length; i++) {
            System.out.println(coffees[i]+ " 하나");
        }

        System.out.println("주세요");

        System.out.println("----------------------------------");
        // enhanced for ( for-each ) 반복문
        // 자료형 타입에 맞는 변수에 값을 저장해주고 출력
        // 배열의 모든 요소를 다 순회할 때 사용
        for (String cafe : coffees) {
            System.out.println(cafe + " 하나");
        }
        System.out.println("주세요");
    }
}

