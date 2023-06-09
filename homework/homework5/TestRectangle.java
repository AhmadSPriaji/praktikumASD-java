public class TestRectangle {
    public static void main(String[] args) {
        // objek r1, r2, r3
        Rectangle r1 = new Rectangle(8, 6);
        Rectangle r2 = new Rectangle(6);
        Rectangle r3 = new Rectangle(2, 3);

        // titik (x0, y0) pada r1, r2 , r3
        r1.x0 = -5;
        r1.y0 = -3;
        
        r2.x0 = 2.8989;
        r2.y0 = 0;

        r3.x0 = -7;
        r3.y0 = -3;

        // output method getArea()
        System.out.println("r1 area: " + r1.getArea());
        System.out.println("r2 area: " + r2.getArea());
        System.out.println("r3 area: " + r3.getArea());
        System.out.println();
        // output method isLargerThan()
        System.out.println("r1 is larger than r2: "+r1.isLargerThan(r2));
        System.out.println("r3 is larger than r1: "+r3.isLargerThan(r1));
        System.out.println();
        // output isIntersectingWith()
        System.out.println("r1 is intersection with r2: "+r1.isIntersectingWith(r2));
        System.out.println("r1 is intersection with r2: "+r1.isIntersectingWith(r3));
    }
}
