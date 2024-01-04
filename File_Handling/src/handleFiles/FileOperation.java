package handleFiles;

import java.io.IOException;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		FileWrite fw = new FileWrite();
		fw.writeFile();
		
		FileRead fr=new FileRead();
		fr.readFile();
		
		CopyFile cf = new CopyFile();
		cf.copyFile();
		
		FileDelete fd = new FileDelete();
		fd.deleteFile();
	

	}

}
