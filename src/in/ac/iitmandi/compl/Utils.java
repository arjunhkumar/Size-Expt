/**
 * 
 */
package in.ac.iitmandi.compl;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

/**
 * @author arjun
 *
 */
public class Utils {
	
	private static final Random RANDOM = new Random();
	private static final String OUT_FILE_PATH = "./out/out.log";

	public static long genRandomLong(long limit) {
	    return RANDOM.nextLong(limit);
	}
	
	public static int genRandomInt(int limit) {
	    return RANDOM.nextInt(limit);
	}
	
	public static void createOutFile() {
		  Path path = Paths.get(OUT_FILE_PATH);
		  File file = new File(OUT_FILE_PATH);
		  if (!file.exists()) {
			  try {
				  Files.createDirectories(path.getParent()); 
				  Files.createFile(path);
			  } catch (IOException e) {
				  System.out.println("File :"+OUT_FILE_PATH+" could not be created.");
			  }
		  }
	  }
	  
	  public static void writeToOutFile(long execTime) {
		  File file = new File(OUT_FILE_PATH);
		  try(BufferedWriter output = new BufferedWriter(new FileWriter(file,true))){
			  try(PrintWriter writer = new PrintWriter(output, true)){
				  writer.write(execTime+"\n");
			  }
		  } catch (IOException e) {
			  System.out.println("File :"+OUT_FILE_PATH+" could not be opened.");
		  }
	  }
}
