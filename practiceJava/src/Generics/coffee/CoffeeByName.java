package Generics.coffee;

public class CoffeeByName {
    public Object name;   // 오브젝트는 int, double, String, 클래스도 가능

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
