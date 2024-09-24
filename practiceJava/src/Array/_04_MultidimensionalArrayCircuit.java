package Array;

public class _04_MultidimensionalArrayCircuit {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seat = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) { // 세로
            for (int j = 0; j < 5; j++) { //가로
                System.out.print(seat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");

        String seats[][] = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };

        for (int i = 0; i < seats.length; i++) {  // 세로이기 때문에 원소 개수가 곧 세로 수
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        // 세로 크기 10 가로 크기 15에 해당하는 영화관
        String[][] seat3 = new String[10][15];
        String[] eng = { "A", "B", "C", "D" ,"E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seat3.length; i++) { //세로
            for (int j = 0; j < seat3[i].length; j++) { //가로
                seat3[i][j] = eng[i] + (j + 1);
            }
        }

        // 표 구매 F8, F9
        seat3[5][7] = "__";
        seat3[5][8] = "__";

        // 영화관 좌석 확인
        for (int i = 0; i < seat3.length; i++) {  // 세로이기 때문에 원소 개수가 곧 세로 수
            for (int j = 0; j < seat3[i].length; j++) {
                System.out.print(seat3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
