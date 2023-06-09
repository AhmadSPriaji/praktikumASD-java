class StudentCard extends Object{
    int id;
    String name;

    StudentCard(){
        this.id = 0;
        this.name = "unspecify";
    }
    StudentCard(String name){
        this.id = 0;
        this.name = name;
    }
    StudentCard(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println(this.id);
        System.out.println(this.name);
    }
}