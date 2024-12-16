package f;

class Bike implements Vehicle {
    int speed;
    int gear;

    Bike() {
        this.speed = 0;
        this.gear = 1;
    }

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Bike gear changed to: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
        System.out.println("Bike speed increased to: " + speed + " km/h");
    }

    @Override
    public void applyBrakes(int decrement) {
        this.speed -= decrement;
        if (this.speed < 0) this.speed = 0;
        System.out.println("Bike speed decreased to: " + speed + " km/h");
    }
}

