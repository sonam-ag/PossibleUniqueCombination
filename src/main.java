package main;

import java.util.Arrays;
import java.util.List;

import util.FileReaderUtil;
import util.GenerateUtil;

public class PossibleUniqueSetGenerater {
	
	public static void main(String args[]) {
		String filePath = "C:\\Users\\sagrawal\\Desktop\\My Data\\DSA\\names.txt";
		String names = FileReaderUtil.fileReader(filePath);
		String[] namesArr = names.split("\\r?\\n");
		//display all possible r unquie sets from n strig
		List<String[]> result=GenerateUtil.generate(namesArr, namesArr.length, 3);
		for (String[] names1 : result) {
		    System.out.println(Arrays.toString(names1));
		}
	}
}
