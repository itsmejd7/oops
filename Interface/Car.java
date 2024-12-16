class Car implements Vehicle {
    int speed;
    int gear;

    Car() {
        this.speed = 0;
        this.gear = 1;
    }

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Car gear changed to: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
        System.out.println("Car speed increased to: " + speed + " km/h");
    }

    @Override
    public void applyBrakes(int decrement) {
        this.speed -= decrement;
        if (this.speed < 0) this.speed = 0;
        System.out.println("Car speed decreased to: " + speed + " km/h");
    }
}
