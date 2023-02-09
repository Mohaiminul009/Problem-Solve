/*
How to calculate area and circumference of a circle in java?
 */
package problemsolve;

public class CircleAreaCircumference {
    double radius = 5;
    
    double area = Math.PI * radius * radius;
    
    double circumference = 2 * Math.PI * radius;
    
    public static void main(String[] args) {
        CircleAreaCircumference cac = new CircleAreaCircumference();
        System.out.println(cac.area);
        System.out.println(cac.circumference);
    }
}
