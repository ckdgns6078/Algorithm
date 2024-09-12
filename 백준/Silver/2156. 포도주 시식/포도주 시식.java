import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr =new int[n+1];
		long[] dp = new long[15000];
		
		for(int i = 1 ; i < n+1 ; i++) {
			arr[i] = sc.nextInt();
		}
		
		dp[1] = arr[1];
		long result = dp[1];
		
		if(n>1) {
			dp[2] = arr[1] + arr[2];
			result = dp[2];
			for(int i = 3 ; i < n+1 ; i++) {

				
				dp[i]= Math.max(dp[i-1], Math.max(dp[i-3] + arr[i-1] + arr[i], dp[i-2]+arr[i]));
				result = Math.max(result, dp[i]);
//				System.out.println("dp["+i+"] :" + dp[i]);
			}	
		}
		System.out.println(result);
		
		
		
		
	}

}
