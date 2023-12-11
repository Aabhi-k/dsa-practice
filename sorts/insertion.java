package dsa;

import java.util.*;

public class insertion {
	public static void ins(ArrayList<Integer> arr) {
		int size = arr.size();
		int key;
		
		for(int i = 0; i < size; i++) {
			key = arr.get(i);
			int j = i;
			while((j >0) && arr.get(j-1) > key) {
				arr.set(j, arr.get(j-1));
				j--;
			}
			arr.set(j, key);
			
			for(int l:arr) {
				System.out.print(l + " ");
			}
			System.out.println();
			
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
			
//		selection(car);
		ins(arr);

		

	}

}
