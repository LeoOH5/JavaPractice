package Method;

public class _07_MainMethod {
    public static void main(String[] args) {
        // main 메소드를 보면 args 라는 스트링 배열을 인자값으로 받는다
        // 오른쪽 위 Current File을 클릭하고 수정해서 args에 값을 넣으면
        // args를 이용해 프로그램을 시작하자마자 원하는 옵션으로 사용할 수 있다.

        for (String s : args) {
            System.out.println(s);
        }

        // 도서관
        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납

        if(args.length == 1){
            switch (args[0]){
                case "1" :
                    System.out.println("도서 조회 메뉴 입니다. ");
                    break;
                case "2" :
                    System.out.println("도서 대출 메뉴 입니다. ");
                    break;
                case "3" :
                    System.out.println("도서 반납 메뉴 입니다. ");
                    break;
                default:
                    System.out.println("잘못입력하였습니다.");
            }
        } else {
            System.out.println("1~3 메뉴 중 하나를 입력하세요.");
        }

    }
}
