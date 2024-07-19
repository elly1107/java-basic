package static2.ex;
public class Car {
    private static int count;
    private String car;

    public Car(String car){
        System.out.println("차량 구입, 이름: "+ car);
        this.car=car;
        this.count++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수: "+ count);
    }
}
