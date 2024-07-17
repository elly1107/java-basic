package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        //instanceValue++; //인스턴스 변수 접근, 컴파일 오류
        //인스턴스를 생성해야 참조값이 생기기 때문이다.
        //instanceMethod(); //인스턴스 메소드 접근, 컴파일 오류
        staticValue++; // 정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }

    //instanceCall은 인스턴스를 만들어야 호출 가능!
    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메소드 접근
        staticValue++; // 정적 변수 접근
        staticMethod(); //정적 메서드 접근
        //DecoData.staticValue++; 와 같다.
    }

    public static void staticCall2(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceValue="+instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue="+staticValue);
    }

}
