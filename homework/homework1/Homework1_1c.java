public class Homework1_1c{
	//main method
	public static void main(String[] args){
		// Homework 1.1: Randomly generate numbers:
		// c) 2,4,6,8
		int min= 2;
		int max= 8;
		int range = max-min + 1; //opersi menentukan range
		int random; 
		do {
			random = (int)(Math.random()*range + min); //casting angka random ke variabel int random
			if (random % 2 == 0){
				System.out.println(random); //output random jika angka yang muncul genap
			}
		}while (random % 2 == 1); //melakukan perulangan jika angka yang muncul ganjil

	}
}