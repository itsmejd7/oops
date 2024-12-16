package f;

class CarFactory {
    // Method to create a car based on the input type
    public Car createCar(String carType) {
        if (carType == null) {
            return null;
        }
        
        if (carType.equalsIgnoreCase("Hatchback")) {
            return new Hatchback();
        } else if (carType.equalsIgnoreCase("Sedan")) {
            return new Sedan();
        } else if (carType.equalsIgnoreCase("SUV")) {
            return new SUV();
        }

        return null;
    }
}
//The equalsIgnoreCase() method in Java is used to compare two strings, ignoring any differences in case (uppercase vs lowercase). This means that it will return true if the two strings are the same when case is ignored, and false otherwise