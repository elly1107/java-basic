package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume=volume;
    }

    void volumeUp(){
        if (volume >= 100) {
            System.out.println("볼륨 최대(100)라 증가 불가");
        }else {
            volume += 10;
            System.out.println("음량 10 증가");
        }
    }

    void volumeDown(){
        if(volume<=0) {
            System.out.println("볼륨 최하(0)라 감소 불가");
        }else{
            volume-=10;
            System.out.println("볼륨 10 감소");
        }
    }

    void showVolume(){
        System.out.println("현재 볼륨: "+ volume);
    }
}
