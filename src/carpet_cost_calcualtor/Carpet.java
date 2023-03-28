package carpet_cost_calcualtor;

public class Carpet {
    double cost;  //instance variable
    public Carpet(double cost){         //constructor with parameter
        if (cost < 0){                  //use of if else syntax
            this.cost = 0;
        }else{
            this.cost = cost;
        }
    }
    public double getCost(){  // with returns no parameter
        return this.cost = cost;
    }
}
