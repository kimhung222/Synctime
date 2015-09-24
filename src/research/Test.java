package research;

public class Test {
	public static String STANDARDLZE(String src){
		for(int i=0;i<src.length();i++){
			if(src.charAt(i)==' '){
				src = src.substring(1);
			}
		}
		return src;
		
	}
	//00:00:50,850 --> 00:00:54,183
	//String[] times = s.replace("-->"," ").split(" ");
public static void main(String[] args){
	
	String s = "00:00:50,850 --> 00:00:54,183";
	String[] times = s.replace("-->"," ").split("   ");
	System.out.println(times.length);
	for(String time : times){
		
		System.out.println(time);
	}
	//System.out.println(Integer.parseInt(STANDARDLZE(s)));
	
}
}
