package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		/*
		//1. make an array of 5 Strings
			String[] strings = {"1", "2", "3", "4", "5"};
		//2. print the third element in the array
			System.out.println(strings[2]);
		//3. set the third element to a different value
			strings[2] = "3 but cooler";
		//4. print the third element again
			System.out.println(strings[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
			for(int i = 0; strings.length>i; i++) {
				System.out.println(strings[i]);
			}
		*/
		//6. make an array of 50 integers
			int[] fifteyRandoNums = {49};
		//7. use a for loop to make every value of the integer array a random number
			Random rando = new Random();
			for(int i = 0; fifteyRandoNums.length>i; i++) {
				fifteyRandoNums[i] = rando.nextInt(1000);
			}
		//8. without printing the entire array, print only the smallest number in the array
			int lowestNum = fifteyRandoNums[0];
			for() {
				if(fifteyRandoNums[num] < lowestNum) {
					fifteyRandoNums[num] = lowestNum;
				}
			}
			System.out.println("Lowest Num: " + lowestNum);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
