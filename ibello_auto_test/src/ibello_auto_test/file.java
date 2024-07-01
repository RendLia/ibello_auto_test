package ibello_auto_test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class file {
	public static void CreatFile(String filename) {
	        try {
	          File myObj = new File(filename);
	          myObj.createNewFile();
	        } catch (IOException e) {
	          e.printStackTrace();
	        }
	      }
	    
	public static void appendfile(String text,String filename) {
		String path = System.getProperty("user.dir") + "\\" + filename;
      try {
          Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
      } catch (IOException e) {
      }
}

}
