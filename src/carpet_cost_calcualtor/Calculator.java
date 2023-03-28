package carpet_cost_calcualtor;

public class Calculator {
    Floor floor;
    Carpet carpet;
    public Calculator(Floor floor, Carpet carpet){  //constructor with parameters
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){   //with return no parameters
        double totalCost;
        totalCost = floor.getArea() * carpet.getCost();
        return  totalCost;

    }
}
