import java.util.*;
public class WaterCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 1; i<=t; i++){
		    
		    int n = sc.nextInt();
		    
		    if(n>=2000){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
    }
}
