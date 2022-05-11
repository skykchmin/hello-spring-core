package hello.core.singleton;

public class StatefulService {

//    private int price; // 상태를 유지하는 빌드

    public int order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
//        this.price = price; // 여기가 문제!
        return price;
    }

    public void getPrice(){
//        return price;
    }
}
