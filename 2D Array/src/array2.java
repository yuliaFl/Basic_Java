/*
 * Yulia Flenova
 * Version 1.0
 * May 14, 2017 
 * 2D Array activity 
 */
import java.util.Scanner;


public class array2 {

	static int[][] initArray() {
		int[][] array = new int[10][10];
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				array[row][col] = (int) (Math.random() * 100 + 1);
				
			}	
		}
		System.out.println("Array initialized");
		System.out.println("");


		return array;
	}

	static int[][] displayArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = (int) (Math.random() * 100 + 1);
				System.out.print(array[row][col] + "\t");
			}
			System.out.println("");
			System.out.println("");

		}
		return array;
	}

	static int[][] sumArray(int[][] array) {
		int total = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				total = total + array[row][col];
			}
		}
		System.out.println("Sum:" + total);
		System.out.println("");

		return array;
	}

	static void sumRow(int[][] array) {
		Scanner input = new Scanner(System.in);
		int enterrow;
		int rowtotal = 0;
		System.out.println("Enter a row: ");
		enterrow = input.nextInt();
		for (int col = 0; col < array.length; col++) {
			rowtotal = rowtotal + array[enterrow][col];
		}
		System.out.println(rowtotal);
		System.out.println("");
	}

	static void sumCol(int[][] array) {
		Scanner input = new Scanner(System.in);
		int entercol;
		int coltotal = 0;
		System.out.println("Enter a colome: ");
		entercol = input.nextInt();
		for (int row = 0; row < array.length; row++) {
			coltotal = coltotal + array[row][entercol];
		}
		System.out.print(coltotal);
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int choice;
		int[][] array = new int[10][10];

		while (true) {
			System.out.println(	"1. Initialize Array \n2. Display Array \n3. Sum Array \n4. Sum By row \n5. Sum By Column \n6. Exit");
			System.out.println("Whose what you want to see : ");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				array = initArray();
				break;
			case 2:
				displayArray(array);
				break;
			case 3:
				sumArray(array);
				break;
			case 4:
				sumRow(array);
				break;
			case 5:
				 sumCol(array);
				break;
			case 6:
				return;
			}
		}

	}
}