package research;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class standlize {
	public static void main(String[] args) throws IOException{
		File file = new File("E:/WORKSPACE/test.txt");
		BufferedReader br = new BufferedReader(new FileReader("E:/WORKSPACE/test.txt"));
		File output = new File("E:/WORKSPACE/Research.txt");
		FileWriter fw = new FileWriter(output);
		String line;
		int second = 3;
		while((line=br.readLine())!=null){
			line = line.replace(" --> "," ");
			String[] parts = line.split(" ");
			for(String part:parts)
			System.out.println(part);
			
		//	fw.write(line+"\r");
			
			
		}
		
		
		br.close();
		fw.close();
		System.out.println("Completed!");
		
		
	}

}
