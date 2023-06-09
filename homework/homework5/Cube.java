public class Cube extends Rectangle {
    // deklarasi fields tambahan lengthdan titik sumbu z0
    double length;
    double z0;

    // modifikasi constructor
    Cube(double width, double height, double length){
        super(width, height);
        this.length = length;
    }
    Cube(double size){
        super(size);
        this.length = size;
    }

    // method getArea (luas permukaan)
    double getArea(){
        return 2 * (this.width*this.length +
        this.width*this.height + 
        this.length*this.height);
    }
    
    // method getVolume
    double getVolume(){
        return this.width*this.length*this.height;
    }

    // method isLargerThan
    boolean isLargerThan(Cube r){
        return this.getVolume() > r.getVolume();
    }

    // method isIntersectingWith
    boolean isIntersectingWith(Cube r){
        if ((this.x0 <= r.x0 && this.y0 <= r.y0 && this.z0 <= r.x0 && //mengecek apakah titik r1 berada di kiri, bawah, belakang r
        this.x0+this.width > r.x0 && this.y0+this.height > r.y0 && this.z0+this.length > r.z0) || //mengecek itersecting
        (this.x0 <= r.x0 && this.y0 <= r.y0 && this.z0 >= r.z0 && //mengecek apakah titik r1 berada di kiri, bawah, depan r
        this.x0+this.width > r.x0 && this.y0+this.height > r.y0 && this.z0 < r.z0+r.length) || //mengecek itersecting
        (this.x0 <= r.x0 && this.y0 >= r.y0 && this.z0 <= r.x0 && //mengecek apakah titik r1 berada di kiri, atas, belakang r
        this.x0+this.width > r.x0 &&  this.y0 < r.y0+r.height && this.z0+this.length > r.z0) || //mengecek itersecting
        (this.x0 <= r.x0 && this.y0 >= r.y0 && this.z0 >= r.z0 && //mengecek apakah titik r1 berada di kiri, atas, depan r
        this.x0+this.width > r.x0 && this.y0 < r.y0+r.height && this.z0 < r.z0+r.length) || //mengecek itersecting
        (this.x0 >= r.x0 && this.y0 <= r.y0 && this.z0 <= r.x0 && //mengecek apakah titik r1 berada di kanan, bawah, belakang r
        this.x0 < r.x0+r.width && this.y0+this.height > r.y0 && this.z0+this.length > r.z0) || //mengecek itersecting
        (this.x0 >= r.x0 && this.y0 <= r.y0 && this.z0 >= r.z0 && //mengecek apakah titik r1 berada di kanan, bawah, depan r
        this.x0 < r.x0+r.width && this.y0+this.height > r.y0 &&  this.z0 < r.z0+r.length) || //mengecek itersecting
        (this.x0 >= r.x0 && this.y0 >= r.y0 && this.z0 <= r.x0 && //mengecek apakah titik r1 berada di kanan, atas, belakang r
        this.x0 < r.x0+r.width && this.y0 < r.y0+r.height && this.z0+this.length > r.z0) || //mengecek itersecting
        (this.x0 >= r.x0 && this.y0 >= r.y0 && this.z0 >= r.z0 && //mengecek apakah titik r1 berada di kanan, atas, depan r
        this.x0 < r.x0+r.width && this.y0 < r.y0+r.height &&  this.z0 < r.z0+r.length) ){
            return true;
        }
        else {
            return false;
        }
    }
}
