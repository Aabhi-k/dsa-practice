package dsa;
import java.util.*;

public class selection {
	
	static void sel2(ArrayList<Integer> arr) {
		int size =arr.size();
		int pos;
		for(int i = 0; i< size; i++) {
			pos = i;
			for(int j = i; j<size; j++) {
				if(arr.get(pos) > arr.get(j)) {
					pos = j;
				}
				
			}
			int min = arr.get(pos);
			arr.set(pos, arr.get(i));
			arr.set(i, min);
			
			
		}
		for(int x:arr) {
			System.out.print(x+ " ");
		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> car = new ArrayList<Integer>();
		int val;
		for(int i =0; i<6; i++) {
			val = (int)(1000.0 * Math.random());
			car.add(val);
			
		}
		System.out.println("Unsorted array: ");
		for(int i: car) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nSorted array: ");
			
//		selection(car);
		sel2(car);
	}

}
