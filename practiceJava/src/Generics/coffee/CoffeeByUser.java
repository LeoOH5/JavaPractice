package Generics.coffee;

import Generics.user.User;

// User나 User를 상속하고 있는 VIPUser만 받겠다는 의미
// 원하는 객체만 전달 받고 싶을 때 사용하면 된다.
public class CoffeeByUser <T extends User> {
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }

}
