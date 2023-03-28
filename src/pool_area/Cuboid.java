package pool_area;

public class Cuboid extends Rectangle{            //child class of Rectangle
    double height;
    public Cuboid(double width, double length, double height){ //constructor with parameters(with parent constructor)
        super(width,length);   // parent class constructor parameters
        this.height = height;
    }
    public double getHeight(){ //with return no parameters
        if (height < 0){            // use of if else syntax
            height = 0;
            return height;
        }else{
            return height;
        }
    }
    public double getVolume(){
        double volume = (getArea() * height);
        return volume;
    }
}
