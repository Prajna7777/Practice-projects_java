package handleFiles;

import java.io.File;

public class FileDelete {
	void deleteFile() {
		try {
			System.out.println("Delete operation fetched");
			// Create a File object with the specified file path
			File file = new File("D:\\javaFsd\\deff.txt");

			// Check if the file exists before attempting to delete
			if (file.exists()) {
				// Use the delete() method to delete the file
				if (file.delete()) {
					System.out.println("File deleted successfully.");
				} 
				else {
					System.out.println("Failed to delete the file.");
				}
			} 
			else {
				System.out.println("The file does not exist.");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}