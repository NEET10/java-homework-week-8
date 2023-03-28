package cylinder;


public class Cylinder extends Circle{  //child class
    double height;      //instance variable
    public Cylinder(double radius, double height) { //constructor with parameter
        super(radius);
        this.height = height;
    }

    public double getHeight(){      //with return no parameters
        if (height < 0){
            height = 0;
            return height;
        }else{
            return height;
        }
    }
    public double getVolume(){
        double volume = ( getArea() * getHeight());
        return volume;
    }
}
