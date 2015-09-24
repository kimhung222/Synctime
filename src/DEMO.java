import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class DEMO {
	public static String STANDARDLZE(String src){
		for(int i=0;i<src.length();i++){
			if(src.charAt(i)==' '){
				src = src.substring(1);
			}
		}
		return src;
		
	}
	public static String HANDLETIME(String s,Time sync){
		String result="";
		// 00:00:50,850 --> 00:00:54,183
		String[] times = s.replace("-->"," ").split("   ");
		Time fromTime = new Time(times[0]);
		Time toTime   = new Time(times[1]);
		result=fromTime.add(sync)+" --> "+toTime.add(sync);
		System.out.println(result);
		
		return result;
		
	}
	public static void main(String args[]) throws IOException {
		Time sync = new Time(0,0,-1);
		
		File file = new File("E:/WORKSPACE/SAMPLE.srt");
	    File fix  = new File("E:/WORKSPACE/FIX1.srt");
		BufferedReader br = new BufferedReader(new FileReader("E:/WORKSPACE/SAMPLE.srt"));
		FileWriter fw = new FileWriter(fix.getAbsoluteFile());
		ArrayList<String> str = new ArrayList<String>();
		String Currentline;
		while((Currentline=br.readLine())!=null){
			if(Currentline.contains("-->")){
				//System.out.println(HANDLETIME(Currentline, sync));
				
				fw.write(HANDLETIME(Currentline, sync)+" \n");
				//str.add(HANDLETIME(Currentline, sync));
				System.out.println(HANDLETIME(Currentline, sync));
			}
			else{
			fw.write(Currentline+" \n");
			System.out.println(Currentline);
			}
			//fw.write("\n");	
		}
		//System.out.println("Complete!");
		for(String ex : str){
			System.out.println(ex);
		}
		System.out.println("Complete!");
		
		
		
	br.close();
	fw.close();
	}
	

}
