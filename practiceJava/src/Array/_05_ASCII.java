package Array;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키코드 (ANSI) : 미국 표준 코드
        // 알파벳 대문자는 65부터 소문자는 97부터 숫자 0은 48부터 시작된다
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);


        String[][] seat3 = new String[10][15];
        char ch = 'A';
        // ch++ = B 성질 이용
        // 아스키코드를 활용해 더 수월하게 저장 가능하다
        for (int i = 0; i < seat3.length; i++) { //세로
            for (int j = 0; j < seat3[i].length; j++) { //가로
                seat3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        for (int i = 0; i < seat3.length; i++) {  // 세로이기 때문에 원소 개수가 곧 세로 수
            for (int j = 0; j < seat3[i].length; j++) {
                System.out.print(seat3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
