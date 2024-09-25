package Method;

public class _03_Return {
    public static String getPhoneNumber() {
        String PhoneNumber = "010-1111-2222";
        return PhoneNumber;
    }

    public static String getAddress() {
        String Address = "고려대학교 세종캠퍼스";
        return Address;
    }

    public static void main(String[] args) {
        // 반환값
        System.out.println("전화번호는 " + getPhoneNumber() + " 입니다. ");

        // 아래 변수와 메소드에 Address는 서로 다른 Address이다.
        String Address = getAddress();
        System.out.println("주소는 " + Address + "입니다.");
    }
}
