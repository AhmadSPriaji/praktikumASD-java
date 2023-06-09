public class Homework1_2{
	//main method
	public static void main(String[] args){
		
		int hasil;
		for(int i=1; i<=9; i++){ //for loop 
			for(int j=1; j<=9; j++){ //nested for loop 
				hasil = i*j; //opersi perkalian
				System.out.print(i + "x" + j + "=" + hasil +"\t"); //print angka dan string opreasi dan tab
			}
			System.out.println(); //print enter
		}
	}
}