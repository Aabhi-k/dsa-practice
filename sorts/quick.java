package youGoB;

import java.util.*;

public class quick {
	static void swap(ArrayList<Integer> arr, int i, int j) {
		int temp = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);
	}
	
	
	static int partition(ArrayList<Integer> arr, int low, int high ) {
		int pivot = arr.get(high);
		int i = low-1;
		
		for(int j = low; j<high; j++) {
			if(arr.get(j) < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
        return (i + 1);
	}
	static void quicksort(ArrayList<Integer> arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
		}
	}
	
	static void printArr(ArrayList<Integer> arr) {
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
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
		
		quicksort(arr, 0, 5);
		printArr(arr);

	}

}
