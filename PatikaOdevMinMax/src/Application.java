import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int min = 1;
		int max = 1;
		
		System.out.println("How many numbers enter : ");
		int counter = scanner.nextInt();
		int[] array = new int[counter];
		
		
		for(int i = 0; i <  array.length; i++) {
			System.out.println("Please enter " + (i+1) + ". number in array : ");
			array[i] = scanner.nextInt();
			
			if(i == 1) {
				max = array[i];
				min = array[i];
			}
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min ) {
				min = array[i];
			}
		}
		System.out.println("Max number: " + max + "\n" +
				"Min number: " + min);
	
		
		
		
		
		
	}

}
