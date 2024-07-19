package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역 변수
        final int data1;

        data1=10; //최초 한번만 할당 가능
        //data1=20; // 두번째 할당부터는 오류 발생

        final int data2=10;
        //data2=20; compile error
    }

    static void method(final int parameter) {
        //parameter=20; compile error
    }
}
