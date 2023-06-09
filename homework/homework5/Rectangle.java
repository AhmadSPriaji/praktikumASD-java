public class Rectangle {
    // deklarasi fields
    double width;
    double height;
    double x0;
    double y0;

    // constructor dengan parameterr width dan height
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    // constructor dengan parameter size
    Rectangle(double size){
        this.width = size;
        this.height = size;
    }

    // method getArea
    double getArea(){
        return this.width*this.height;
    }

    // method isLargerThan
    boolean isLargerThan(Rectangle r){
        return this.getArea() > r.getArea();
    }

    // method isIntersectingWith
    boolean isIntersectingWith(Rectangle r){
        if ((this.x0 <= r.x0 && this.x0+this.width > r.x0 && this.y0 <= r.y0 && this.y0+this.height > r.y0) || //intersecting di sisi kanan atas r1
        (this.x0 <= r.x0 && this.x0+this.width > r.x0 && this.y0 >= r.y0 && this.y0 < r.y0+r.height) || //intersecting di sisi kanan bawah r1
        (this.x0 >= r.x0 && this.x0 < r.x0+r.width && this.y0 <= r.y0 && this.y0+this.height > r.y0) || //intersecting di sisi kiri atas r1
        (this.x0 >= r.x0 && this.x0 < r.x0+r.width && this.y0 >= r.y0 && this.y0 < r.y0+r.height) ){ //intersecting di sisi kiri bawah r1
            return true;
        }
        else {
            return false;
        }
    }
}
