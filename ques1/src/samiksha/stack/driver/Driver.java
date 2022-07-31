package samiksha.stack.driver;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arraySize;
		
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		arraySize = value.nextInt();
		int floors[]= new int [arraySize];
		
		for(int i=0;i<arraySize;i++) {
			System.out.println("enter the floor size given on day :" + (i+1));
			floors[i] = value.nextInt();
		}
		
		for(int i=0;i<floors.length;i++) {
			//System.out.println(floors[i]);
			System.out.println("Day:" + (i+1));
			if(floors[i] > floors[i+1] || floors[i] == floors.length-1) {
				System.out.println(floors[i]);
			}
		}
		
		
	}

}
