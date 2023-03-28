package methodoverriding24;

class AXIS extends Bank {//creating child class
    @Override
    public int getRateOfInterest() {
        return 9;
    }
}
