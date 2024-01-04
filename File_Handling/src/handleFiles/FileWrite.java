package handleFiles;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite{
	FileOutputStream fout;
	
	void writeFile() throws IOException {
		try {
			fout = new FileOutputStream("D:\\javaFsd\\javaabc.txt");
			String msg = "May God bless You!" ;
			byte a[] = msg.getBytes();
			System.out.println("File Created Successfully");
			fout.write(a);	
		}

		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			fout.close();
		}
	}
}