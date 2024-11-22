package lv.rvt;

public class Timer {
    
    private ClockHand seconds;
    private ClockHand hundreds;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundreds = new ClockHand(100);

    }
    
    public void advance(){
        this.hundreds.advance();

        if (this.hundreds.value()== 0){
            this.seconds.advance();
        }
    }
    
    public String toString(){
        return seconds+":"+ hundreds;
    }
}

