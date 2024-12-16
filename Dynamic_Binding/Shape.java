package f;

abstract class Shape {
    double dimension1;
    double dimension2;

    // Method to input dimensions
    void input(double dim1, double dim2) {
        this.dimension1 = dim1;
        this.dimension2 = dim2;
    }

    // Abstract method to compute area
    abstract void compute_area();
}
