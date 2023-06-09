public class NewTestMethod {
    public static void printStudentInfo (Student s){
        System.out.println("Nama: " + s.name);
        System.out.println("Umur: " + s.age);
    }
    public static boolean isSameAge(Student s0, Student s1) {
        if (s0.age == s1.age){
            return true;
        }
        else{
            return false;
        }
    }
    public static Student getYoungestStudent(Student[] students) {
        Student youngestStudent = new Student();
        youngestStudent = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].age < youngestStudent.age) {
                youngestStudent = students[i];
            }
        }
        return youngestStudent;
    }
    public static double getRectangleArea(Rectangle r) {
        return r.width * r.height;
    }
    public static Rectangle getSquare(double d) {
        Rectangle side = new Rectangle();
        side.width = d;
        side.height = d;
        return side;
    }

    public static void main(String[] args) {
        // confirm method printStudentInfo
        Student siswa = new Student();
        siswa.name = "Afif Taufiqi";
        siswa.age = 18;
        printStudentInfo(siswa);
        System.out.println();

        // confirm method isSameAge
        Student murid0 = new Student();
        murid0.name = "Aisyah Putri";
        murid0.age = 18;
        Student murid1 = new Student();
        murid1.name = "Dhanada Santika";
        murid1.age = 17;
        System.out.println(isSameAge(murid0, murid1));
        System.out.println();
        
        // confirm method getYoungestStudent
        Student[] murid = new Student[3];
        murid[0]= new Student();
        murid[0].name = "Andree";
        murid[0].age = 18;
        murid[1]= new Student();
        murid[1].name = "Ijamm";
        murid[1].age = 19;
        murid[2]= new Student();
        murid[2].name = "Apiss";
        murid[2].age = 17;
        Student termuda = getYoungestStudent(murid);
        System.out.println("Murid Termuda");
        System.out.println("Nama: " + termuda.name);
        System.out.println("Umur: " + termuda.age);
        System.out.println();

        // confirm method getRectangleArea
        Rectangle kotak = new Rectangle();
        kotak.width = 125.75;
        kotak.height = 4.8;
        System.out.println("Luas persegi panjang: " + getRectangleArea(kotak));
        System.out.println();

        // confirm method getSqare
        Rectangle persegi = new Rectangle();
        persegi = getSquare(7.25);
        System.out.println("Panjang persegi: " + persegi.width);
        System.out.println("Lebar persegi: " + persegi.height);
    }
}
