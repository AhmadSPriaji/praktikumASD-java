public class TestCube {
    public static void main(String[] args) {
        // objek r1, r2, r3
        Cube r1 = new Cube(8, 6, 7);
        Cube r2 = new Cube(6);
        Cube r3 = new Cube(2, 3, 5);

        // titik (x0, y0, z0) pada r1, r2 , r3
        r1.x0 = -5;
        r1.y0 = -3;
        r1.z0 = 2;
        
        r2.x0 = 2.8989;
        r2.y0 = 0;
        r2.z0 = 1;

        r3.x0 = -7;
        r3.y0 = -3;
        r3.z0 = -4;

        // output method getArea()
        System.out.println("r1 area: " + r1.getArea());
        System.out.println("r2 area: " + r2.getArea());
        System.out.println("r3 area: " + r3.getArea());
        System.out.println();
        // output method getVolume()
        System.out.println("r1 volume: " + r1.getVolume());
        System.out.println("r2 volume: " + r2.getVolume());
        System.out.println("r3 volume: " + r3.getVolume());
        System.out.println();
        // output method isLargerThan()
        System.out.println("r1 is larger than r2: "+r1.isLargerThan(r2));
        System.out.println("r3 is larger than r1: "+r3.isLargerThan(r1));
        System.out.println();
        // output isIntersectingWith()
        System.out.println("r1 is intersection with r2: "+r1.isIntersectingWith(r2));
        System.out.println("r1 is intersection with r3: "+r1.isIntersectingWith(r3));
    }
}
