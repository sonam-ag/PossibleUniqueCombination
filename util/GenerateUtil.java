package util;

import java.util.ArrayList;
import java.util.List;

/*
 * Utility to generate unique combination
 */
public class GenerateUtil {
	
	private static void helper(String[] arr, List<String[]> combinations, String data[], int start, int end, int index) {
		if (index == data.length) {
	    	String[] combination = data.clone();
	        combinations.add(combination);
	    } else if (start <= end) {
	        data[index] = arr[start];
	        helper(arr,combinations, data, start + 1, end, index + 1);
	        helper(arr,combinations, data, start + 1, end, index);
	    }
	}

	public static List<String[]> generate(String[] arr,int n, int r) {
	    List<String[]> combinations = new ArrayList<>();
	    helper(arr,combinations, new String[r], 0, n-1, 0);
	    return combinations;
	}

}
