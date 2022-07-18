
/**
 * Perimeter
 */
public class Perimeter {
    public String triangle(Float a , Float b , Float c) {
        float perimeter = a+b+c;
        String value = "Triangle Perimeter = " + perimeter;
        return value;
    }

    public String square(double d) {
        float perimeter = d * 4;
        String value = "Square Perimeter = " + perimeter;
        return value;
    }

    public String rectangle(Float a , Float b) {
        float perimeter = 2*(a +b);
        String value = "Rectangle Perimeter = " + perimeter;
        return value;
    }
}