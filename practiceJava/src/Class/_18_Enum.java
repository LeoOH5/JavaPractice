package Class;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력 : Jan , Feb , Mar, ...
        // 옷 사이즈 : S , M , L , ...
        // 상수들의 묶음

        Resolution resolution = Resolution.HD; // 초기화
        System.out.println(resolution);

        resolution = Resolution.FHD; // 값 변경 가능
        System.out.println(resolution);

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        for(Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
            // .name = 안에 데이터
            // .ordinal = 인덱스
        }

        for(Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
            // .name = 안에 데이터
            // .ordinal = 인덱스
        }
    }
}

// enum 선언
/*enum Resolution {
    HD, FHD, UHD
}*/

// 열거형에 다른 실제 값을 넣고 싶을 때
enum  Resolution {
    HD(1280), FHD(1920), UHD(3840);  // 세미클론을 꼭 적어줘야 한다.

    private final int width;
    Resolution(int width){
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
