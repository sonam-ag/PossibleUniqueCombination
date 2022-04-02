package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
/*
 * Utility to read a file 
 * filePath is file path 
 */
public class FileReaderUtil {

	public static String fileReader(String filePath ){
		StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))  {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        } 
        catch (IOException e)  {
            e.printStackTrace();
        }
        return contentBuilder.toString();

	}
}
