package lv.rvt;

class Box {
    
    public double length;
    public double width;
    public double height;


    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }



private double faceArea(){
double face = this.height * this.width;
    return face;
}

private double topArea(){
double top = this.width*this.length;
return top;
}

private double sideArea(){
double side = this.length*this.height;
return side;
}

public double area()
{
  return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;              
}

public double volume()
{
  return length*height*width ;              
}


public  Box(Box oldBox) {
    oldBox.width =this.width *0.75;
    oldBox.height=this.height*0.75;
    oldBox.length= this.length*0.75;
}




public Box biggerBox( Box oldBox){
    return new Box (1.25*oldBox.width,1.25*oldBox.height,1.25*oldBox.length);
}

}