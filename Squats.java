import java.util.*;
import java.io.*;
import java.lang.*;
public class Squats {
    public static void main(String[] args) throws Exception{
        	// your code goes here
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i<=t; i++){
		    int a = Integer.parseInt(bf.readLine());
		    
		    int mul = 15*a;
		    
		    System.out.println(mul);
		}
    }
}
