public class IStudentCard extends StudentCard{
    String nationality; //add nationality field
    IStudentCard(){
        super();
        this.nationality = "unspecified";
    }
    IStudentCard(String name){
        super(name);
        this.nationality = "unspecified";
    }
    IStudentCard(String nationality){
        super();
        this.nationality = nationality;
    }
}
