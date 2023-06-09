public class LineLength {
    public static void main(String[] args) {
        Line line = new Line();
        line.p0 = new Point();
        line.p0.x = 5;
        // (task 1)
        line.p0.y = 4;
        line.p1 = new Point();
        line.p1.x = 13;
        line.p1.y = 9;

        double d;
        // (task 2)
        d = Math.sqrt((line.p1.x-line.p0.x)*(line.p1.x-line.p0.x) 
                    + (line.p1.y-line.p0.y)*(line.p1.y-line.p0.y)
            );
        System.out.println("the legth of the line is " + d);
    }
}
