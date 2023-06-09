public class Homework1All{
	//main method
	public static void main(String[] args){
		//Randomly generate numbers between 0-1
		// System.out.println(Math.random());

		//Activity 2: add codes here to generate integers 0,1,2,...,9
		// double random = Math.random()*10;
		// int bulat = (int)random;
		// System.out.println(bulat);

		// Homework 1.1: add codes to generate:
		// a) 0,1,2,3\
		int min= 0;
		int max= 3;
		int range = max-min + 1;
		int random = (int)(Math.random()*range + min);
		System.out.println(random);

		// b) 1,2,3,4,5,6
		// int min= 1;
		// int max= 6;
		// int range = max-min + 1;
		// int random = (int)(Math.random()*range + min);
		// System.out.println(random);

		// c) 2,4,6,8
		// int min= 2;
		// int max= 8;
		// int range = max-min + 1;
		// int random;
		// do {
		// 	random = (int)(Math.random()*range + min);
		// 	if (random % 2 == 0){
		// 		System.out.println(random);
		// 	}
		// }while (random % 2 == 1);

		// d) -5,-4,...,4,5
		// int min= -5;
		// int max= 5;
		// int range = max-min + 1;
		// int random = (int)(Math.random()*range + min);
		// System.out.println(random);
		
		// int hasil;
		// for(int i=1; i<=9; i++){
		// 	for(int j=1; j<=9; j++){
		// 		hasil = i*j;
		// 		System.out.print(i + "x" + j + "=" + hasil +"\t");
		// 	}
		// 	System.out.println();
		// }
	}
}