package easy;

import java.util.ArrayList;

public class Utils {
	public static void printArray(int[] vals){
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (Integer obj: vals){
			array.add(obj);
		}
		System.out.println(array);
	}
}
