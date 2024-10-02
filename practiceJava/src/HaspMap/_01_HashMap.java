package HaspMap;

import java.util.HashMap;

public class _01_HashMap {
    public static void main(String[] args) {
        // 맵 (Key ,Value)
        // 앞이 Key 데이터타입 뒤가 Value 데이터타입
        // HashMap도 순서 보장안됨
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("카리나", 10);
        map.put("윈터", 5);
        map.put("닝닝", 3);
        map.put("지젤", 7);
        map.put("지젤", 9); // 중복되 키 값이 존재하지 않는다. 마지막에 들어온 것으로 사용


        System.out.println("총 고객 수 : " + map.size());
        System.out.println("-----------------------------");

        // 조회
        System.out.println("카리나의 포인트 : " + map.get("카리나"));
        System.out.println("윈터 포인트 : " + map.get("윈터"));
        System.out.println("-----------------------------");

        // 확인
        if(map.containsKey("지젤")) {
            int point = map.get("지젤");
            map.put("지젤", ++point);
            System.out.println("지젤님의 누적 포인트 : " + map.get("지젤"));
        } else {
            map.put("지젤", 1);
            System.out.println("지젤님 신규 등록 (포인트 1)");
        }

        System.out.println("-----------------------------");

        for(Integer i : map.values()) {
            System.out.println(i);
        }

        System.out.println("-----------------------------");

        // 삭제
        map.remove("지젤");
        System.out.println(map.get("지젤")); // 없어서 null 값 반환
        System.out.println("-----------------------------");


        // 전체 삭제
        map.clear();
        if(map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("폐업");
        }
        System.out.println("-----------------------------");

        map.put("카리나", 10);
        map.put("윈터", 5);
        map.put("닝닝", 3);
        map.put("지젤", 9);

        for(String key : map.keySet())  {
            System.out.println(key);
        }

        System.out.println("-----------------------------");

        // Key & Value를 함께 확인하는 방법
        for(String key : map.keySet())  {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }

        System.out.println("-----------------------------");


    }
}
