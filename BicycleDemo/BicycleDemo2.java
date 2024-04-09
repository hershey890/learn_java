interface Bicycle {

    // wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}


class ACMEBicycle implements Bicycle {
    
    public int cadence = 0;
    public int speed = 0;
    public int gear = 1;

    // The compiler will now require that methods
    // changeCadence, changeGear, SpeedUp, and applyBrakes
    // all be implemented. Compilation will fail if those
    // methods are missing from this class.

    public void changeCadence(int newValue) {
         cadence = newValue;
    }

    public void changeGear(int newValue) {
         gear = newValue;
    }

    public void speedUp(int increment) {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}


class BicycleDemo2 {
    public static void main(String[] args) {

        // Create 2 different bicycle objects
        ACMEBicycle bike1 = new ACMEBicycle();
        ACMEBicycle bike2 = new ACMEBicycle();

        // Invoke methods on those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.speedUp(10);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
