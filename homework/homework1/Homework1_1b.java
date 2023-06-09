public class Homework1_1b{
	//main method
	public static void main(String[] args){
		// Homework 1.1: Randomly generate numbers:
		// b) 1,2,3,4,5,6
		int min= 1;
		int max= 6;
		int range = max-min + 1; //operasi menentukan range
		int random = (int)(Math.random()*range + min);  //casting angka random ke variabel int random
		System.out.println(random); //output angka random

	}
}