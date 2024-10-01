package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        // 세트 => 중복을 허용하지 않는다.
        // 순서 보장이 안된다.

        HashSet<String> set = new HashSet<>();

        // 데이터 추가
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 : " + set.size() );

        // 순회
        for(String s : set) {
            System.out.println(s + " ");
        }

        System.out.println("----------------------------------");

        // 확인
        // contains - 삼겹살이 존재하면 true 아니면 false
        if(set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 가자");
        }

        System.out.println("----------------------------------");

        // 삭제
        System.out.println("총 구매 해야하는 상품 수 (삼겹살 구매 전) : " + set.size()); // 7
        set.remove("삼겹살");
        System.out.println("총 구매 해야하는 상품 수 (삼겹살 구매 후) : " + set.size()); // 6

        System.out.println("----------------------------------");

        // 전체 삭제
        set.clear();
        if(set.isEmpty()) {
            System.out.println("남은 구매 상품 수 : " + set.size());
            System.out.println("집으로 출발");
        }

        System.out.println("----------------------------------");

        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(5);
        intSet.add(0);
        intSet.add(13);

        for(int i : intSet) {
            System.out.println(i);
        }

        System.out.println("----------------------------------");

        // 세트를 사용하면서 순서를 보장하고 싶으면 LinkedHashSet 사용
        HashSet<Integer> intSet2 = new LinkedHashSet<>();
        intSet2.add(1);
        intSet2.add(5);
        intSet2.add(0);
        intSet2.add(13);

        for(int i : intSet2) {
            System.out.println(i);
        }


    }
}
