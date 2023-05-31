import java.util.Scanner;

public class MasterChefFinals {
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 1;i<=t;i++){
		    
		    int n = sc.nextInt();
		    
		    if(n<=10){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
    }
}