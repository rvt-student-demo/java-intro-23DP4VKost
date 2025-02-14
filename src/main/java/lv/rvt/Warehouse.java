package lv.rvt;

public class Warehouse {

    private double capacity;
    private double balance;
    

    public Warehouse(double capacity){
        if (capacity>0 ){
            this.capacity = capacity;
        } else{
            this.capacity = 0.0;
        }
        this.balance = 0;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double howMuchSpaceLeft(){
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount){
        if (amount <= 0){
            return;
        }
        if (amount > this.howMuchSpaceLeft()){
            this.balance = this.balance + amount;
        }
        else{
            this.balance = this.capacity;
        }

        }
    

    public double takefromWareHouse(double amount){
        if (amount < 0){
            return 0;
        }

        else{
            this.balance = this.balance - amount;
            return amount;
        }  
    }

    public String toString(){
        return "balance = " +this.balance +", space left " + this.howMuchSpaceLeft();
    }
}