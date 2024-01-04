package handleFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
	FileInputStream fin;
	FileOutputStream fout;
	void copyFile() {
		try {
			System.out.println("\nExecuting File Copy Code");
			fin = new FileInputStream("D:\\javaFsd\\javaabc.txt");
			fout = new FileOutputStream("D:\\javaFsd\\Prajna.txt");
			int i=0;
			while((i=fin.read()) != -1) {
				fout.write((byte)i);
			}
			System.out.println("File Copied Successfully...");

		}
		catch(Exception e) {
			
		}
		finally {
			
		}
	}
}
