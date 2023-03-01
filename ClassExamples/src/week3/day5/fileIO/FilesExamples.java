package week3.day5.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesExamples {

	public static void main(String[] args) {
		// using a single dot(.) means the current directory
		// using a double dot(..) means the parent directory
		
		// relative path is based on where you currently are in the folder structure
		//absolute path is from the root of the folder structure
		
		// this uses an absolute path to get the starting directory of this eclipse project
		File file = new File("./src/week3/day5/fileIO");
		
		
		// printing absolute path gets us the full path from the root
		System.out.println(file.getAbsolutePath());
		
		if(file.isDirectory()) {
			System.out.println(file.getName() + "is a directory");
//			System.out.println(file.getParentFile());
			
			for(File f : file.listFiles()) {
				System.out.println(f.getName());
			}
		}
		
		File developmentFolder = new File("D:/development");
		System.out.println(developmentFolder.getAbsolutePath());
		
		if(developmentFolder.isDirectory()) {
			System.out.println(developmentFolder.getName() + " is a directory");
			
			for(File f : developmentFolder.listFiles()) {
				System.out.println(f.getName());
			}
		}
		
		System.out.println("===========================");

		
		//creating a new file
		File code = new File("./src/week3/day5/fileIO/FilesExamples.java");
		System.out.println("The file exists? => " + code.exists());
		if(code.exists()) {  // return true or False
			System.out.println("File is Found ");
			System.out.println("IS file Readable " +  code.canRead());
			System.out.println("IS file Writeable " +  code.canWrite());
			System.out.println("File size in a bytes " + code.length()); // file size in byte
	    }
		System.out.println("***************************");
		try {
			BufferedReader br = new BufferedReader(new FileReader(code));
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		System.out.println("===========================");
		
		
		//try this later
//		File textFile = new File("D:/development/classNotes.txt");
//		if(textFile.exists()) {
//			System.out.println(textFile.getName() + " exists");
//			System.out.println("IS file Readable " +  textFile.canRead());
//			System.out.println("IS file Writeable " +  textFile.canWrite());
//			System.out.println("File size in a bytes " + textFile.length()); // file size in byte
//			try {
//				Scanner sc = new Scanner(textFile);
//				String data = "";
//				while (sc.hasNextLine()) {
//					data = sc.nextLine();
//					System.out.println(data);
//				}
//				sc.close();
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Either file is not found or file is not able to access");
//				e.printStackTrace();
//			}
//			
//		}
		
//		try {
//			File newFile = new File("D:/development/newFile.txt");
//			if(newFile.createNewFile()) {
//				System.out.println(newFile.getName() + " created successfully");
//			}else {
//				System.out.println("The file " + newFile.getName() + " already exists");
//				System.out.println("File Path: " + newFile.getPath());
//				System.out.println("Is path absolute " + newFile.isAbsolute());
//				System.out.println("The absolute path is " + newFile.getAbsolutePath());
//				System.out.println("The parent folder is " + newFile.getParent());
//			}
//			System.out.println(newFile.exists() ? "Yes file exists" : "file does not exist");
//			
//			if(newFile.exists()) {
//				System.out.println("File is Found");
//				System.out.println("IS file Readable " +  newFile.canRead());
//				System.out.println("IS file Writeable " +  newFile.canWrite());
//				System.out.println("File size in a bytes " + newFile.length()); // file size in byte
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
