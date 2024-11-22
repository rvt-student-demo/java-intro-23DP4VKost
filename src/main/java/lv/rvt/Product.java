package lv.rvt;

public class Product {
 
    public String name;
    public String location; 
    public int weigth;
    
    public Product(String name, String location, int weigth){
        this.name = name;
        this.location = location;
        this.weigth = weigth;
    }


        
    Product(String name){
        this(name,"shelf",1);
    }


    Product(String name, String location){
       this(name, location, 1);
    }

    Product(String name, int weigth){
        this(name, "shelf", weigth);
    }

    public String toString(){
        return name+" ("+weigth+"kg)"+ " can be found from the "+location;
    }

}   
    

