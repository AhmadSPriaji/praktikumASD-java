public class Homework1_1a{
	//main method
	public static void main(String[] args){
		// Homework 1.1: Randomly generate numbers:
		// a) 0,1,2,3\
		int min= 0; 
		int max= 3;
		int range = max-min + 1; //operasi menentukan range
		int random = (int)(Math.random()*range + min);  //casting angka random ke variabel int random
		System.out.println(random); //output angka random
	}
}
