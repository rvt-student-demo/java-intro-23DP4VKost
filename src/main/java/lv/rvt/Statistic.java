package lv.rvt;

public class Statistic {

    private int count;
    private int sum;
    public Statistic() {
        this.sum = 0;
        this.count = 0;
    }
    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int count() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return this.sum / (double) this.count;
    }

}

