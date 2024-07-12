package access.ex;

public class MaxCounter {
    private int count=0;
    private int max;

    public MaxCounter(int max){
        this.max=max;
    }

    public void increment(){
        //곰중
        if(this.count>=this.max){
            System.out.println("최대값 초과");
            return;
        }
        //실행
        this.count ++;

    }

    public int getCount(){
        return this.count;
    }
}
