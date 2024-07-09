package oop1;

public class MusicPlayer {
    int volume=0;
    boolean isOn=false;

    void on() {
        isOn=true;
        System.out.println("음악 시작");
    }

    void off() {
        isOn=false;
        System.out.println("음악 끝");
    }

    void volumeUp() {
        volume++;
        System.out.println("volume: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("volume: " + volume);
    }

    void showStatus() {
        System.out.println("상태 확인");
        if(isOn){
            System.out.println("ON, volume: "+volume);
        }else{
            System.out.println("OFF");
        }
    }
}
