package handleFiles;

import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {
	FileInputStream fin;
	void readFile() throws IOException {
		try {
			fin = new FileInputStream("D:\\javaFsd\\javaabc.txt");
			System.out.println("Reading the file: javaabc.txt");
			int i=0;
			while((i=fin.read()) != -1) {
				System.out.print((char)i);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			fin.close();
		}
	}
}