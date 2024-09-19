/**
 * 
 */
package slideDeckExercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class WritingToAFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//text to be added to the file
			String text = "\nI am currently doing the MSc part time";
			
			//create the file to be written to
			File file = new File("Info.txt");
			
			//using the Write objects to write text to the file
			
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(text);
			
			System.out.println("Write complete - check the file");
			
			//close resources
			
			bufferedWriter.close();
			fileWriter.close();
			
		} catch(IOException e) {
			System.out.println("Problem with file write");
			e.printStackTrace();
		}

			
		
			
	}

}
