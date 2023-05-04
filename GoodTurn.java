import java.util.*;
import java.lang.*;
import java.io.*;

public class GoodTurn {

    // problems links
    // https://www.codechef.com/problems/GDTURN
    public static void main(String[] args) {

		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int x,y;
		
        for (int i = 1; i <= t; i++) {

            x = sc.nextInt();
            y = sc.nextInt();

            int c = x + y;
            if (c > 6) {
                System.out.println("YES");

            }

            else {
                System.out.println("NO");
            }

        }
    }
}
