public class TestPoint {
    public static void methodA(Point p1) {
        p1.x++;
        p1.y--;
    }
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 10;
        methodA(p1);
        System.out.println("p1.x=" + p1.x);
        System.out.println("p1.y=" + p1.y);
    }
}
