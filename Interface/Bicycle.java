package f;
class Bicycle implements Vehicle {
    int speed;
    int gear;

    Bicycle() {
        this.speed = 0;
        this.gear = 1;
    }

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Bicycle gear changed to: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
        System.out.println("Bicycle speed increased to: " + speed + " km/h");
    }

    @Override
    public void applyBrakes(int decrement) {
        this.speed -= decrement;
        if (this.speed < 0) this.speed = 0; // Speed can't go below 0
        System.out.println("Bicycle speed decreased to: " + speed + " km/h");
    }
}
