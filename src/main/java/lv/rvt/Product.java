package lv.rvt;

public class Product {
    
    public String name; 
    public double price;
    public int pcs;
    
    Product(String name, double price, int pcs){
        this.name = name;
        this.price = price;
        this.pcs = pcs;
    }
    public void printProduct(){
        System.out.println(name + " Price:" + price + " " + pcs + "pcs");
    }
}