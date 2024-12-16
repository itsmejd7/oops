package f;

class Rectangle extends Shape {
    @Override
    void compute_area() {
        double area = dimension1 * dimension2; // Formula: length * breadth
        System.out.println("Area of Rectangle: " + area);
    }
}
