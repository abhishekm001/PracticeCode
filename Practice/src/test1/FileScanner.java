package test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		String filepath = FileScanner.class.getResource("filetest1.txt").getPath();
		
		Scanner s = null;
		
		try {
			s = new Scanner(new File(filepath));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(new File("\\src\\test1\\filetest1.txt").getAbsolutePath() );
			System.exit(0);
		}
		
		while(s.hasNextLine()){
			
			String[] strList = s.nextLine().trim().split(",");
			System.out.println(strList[0].trim());
			
		}
		s.close();
		
		
		
		
		
	}

}
