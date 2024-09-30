package Class.Camera;

public final class ActionCam extends Camera{ // 클래스에 final 사용시 상속 불가
    public final String lens = "광각렌즈"; // 어디에서도 렌즈 값을 못 바꿈

    public ActionCam() {
        super("액션 카메라");
        // lens = "광각렌즈";
        // 선언만 해두고 생성자에서 초기하를 해도 된다.
        // 생성자는 객체가 만들어질 때 호출되기 때문
    }

    public final void makeVideo() {
        // 메소드에도 final 사용 가능 메소드 오버라이딩 불가
        System.out.println(this.name + " : 비디오를 제작합니다." + this.lens + " 사용");
    }
}
