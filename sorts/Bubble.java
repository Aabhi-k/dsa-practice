package youGoB;

import java.util.*;

public class Bubble {
	static void bubble(ArrayList<Integer> arr) {
		int size = arr.size();
		
		int temp;
		boolean swapped;
		for(int i = 0; i < size-1; i++) {
			swapped = false;
			for(int j = 0; j < size-i-1; j++) {
				if(arr.get(j) > arr.get(j+1)) {
					temp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
		
		for(int i:arr) {
			System.out.print(i + " ");
		}
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int val;
		for(int i =0; i<6; i++) {
			val = (int)(1000.0 * Math.random());
			arr.add(val);
			
		}
		System.out.println("Unsorted array: ");
		for(int i: arr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nSorted array: ");
		bubble(arr);
	}

}
