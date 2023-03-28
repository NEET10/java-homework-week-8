package methodoverriding24;

class SBI extends Bank{//Creating child class

    @Override
    public int getRateOfInterest() {
        return 8;
    }
}
