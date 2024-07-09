package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args){
        int volume=0;
        boolean isOn=false;

        isOn=true;
        System.out.println("음악 시작");

        volume++;
        System.out.println("볼륨: "+volume);

        if(isOn){
            System.out.println("ON, 볼륨: "+volume);
        }else{
            System.out.println("OFF");
        }
    }
}
