package Class;

import Class.Camera.ActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final

        // public (final) class ...
        // public (final) void ...
        // public > abstract > static > final > ... 순이다.

        ActionCam actionCam = new ActionCam();
        //actionCam.lens = "표준렌즈"; final로 선언해서 값을 변경 못한다.
        actionCam.recordVideo();
        actionCam.makeVideo();
    }
}
