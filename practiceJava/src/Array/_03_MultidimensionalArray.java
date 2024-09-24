package Array;

public class _03_MultidimensionalArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열 - matrix)

        // 소규모 영화관 좌석
        // A1 ~ A5
        // B1 ~ B5
        // C1 ~ C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};


        // 3 x 5  크기의 2차원 배열
        String[][] seat = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // B2에 접근
        // 첫 번째 칸이 세로 줄 두 번째 칸이 가로 줄
        System.out.println(seat[1][1]);

        // C4에 접근
        System.out.println(seat[2][3]);

        System.out.println("---------------------------------");
        // 첫 줄에는 3칸, 둘째 줄에는 4칸 셋째 줄에는 5칸 있는 영화관
        String seats[][] = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };

        // A3에 접근
        System.out.println(seats[0][2]);

    }
}
