package f;

class Triangle extends Shape {
    @Override
    void compute_area() {
        double area = 0.5 * dimension1 * dimension2; // Formula: 1/2 * base * height
        System.out.println("Area of Triangle: " + area);
    }
}
