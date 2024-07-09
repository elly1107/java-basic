package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args){
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);

    }

    static void on(MusicPlayerData data) {
        data.isOn=true;
        System.out.println("음악 시작");
    }

    static void off(MusicPlayerData data) {
        data.isOn=false;
        System.out.println("음악 끝");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("volume: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("volume: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("상태 확인");
        if(data.isOn){
            System.out.println("ON, volume: "+data.volume);
        }else{
            System.out.println("OFF");
        }
    }
}
