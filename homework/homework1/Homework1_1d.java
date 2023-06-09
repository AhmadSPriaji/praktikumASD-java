public class Homework1_1d{
	//main method
	public static void main(String[] args){
		// Homework 1.1: Randomly generate numbers:
		// d) -5,-4,...,4,5
		int min= -5; 
		int max= 5;
		int range = max-min + 1; //operasi menentukan range
		int random = (int)(Math.random()*range + min);  //casting angka random ke variabel int random
		System.out.println(random); //output angka random
		
	}
}