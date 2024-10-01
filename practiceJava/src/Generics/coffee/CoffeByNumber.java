package Generics.coffee;

public class CoffeByNumber {
    public  int waitingNumber = 0;

    public CoffeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + waitingNumber);
    }


}
