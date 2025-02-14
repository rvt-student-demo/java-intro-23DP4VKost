package lv.rvt;

public class ProductWareHouse extends Warehouse {
 private String wareHouseName;

    public ProductWareHouse(String wareHouseName, double capacity){
    super(capacity);
    this.wareHouseName = wareHouseName;
}
    

    public String getName(){
    return this.wareHouseName;
}

    public void setName(String name){
    this.wareHouseName = name;
 }


 public String toString(){
return this.wareHouseName+":balance = "+super.getBalance()+", space left" + super.howMuchSpaceLeft();
 }
}
