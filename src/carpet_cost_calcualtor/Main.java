package carpet_cost_calcualtor;

public class Main {             //calling all methods from different class, it is possible as all class have public modifier
    public static void main(String [] args){
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= "+ calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= "+calculator.getTotalCost());

    }
}
