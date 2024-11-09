package lv.rvt;

public class App 
{
    public class Main 
    {
        public static void main(String[] args) 
        {
            Product Product1 = new Product("Banana",1.1,13);
            Product Product2 = new Product("Gruwa",1.5,7);

            Product1.printProduct();
            System.out.println();
            Product2.printProduct();
            
        }
    }
}