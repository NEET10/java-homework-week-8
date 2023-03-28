package carpet_cost_calcualtor;

public class Floor {
    double width;           //instance variable
    double length;
    public Floor(double width, double length) {  //constructor with parameters
        if (width < 0) {                        //if else syntax
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
    public double getArea (){
                  return this.length * this.width;
        }      //with return no parameters

}
