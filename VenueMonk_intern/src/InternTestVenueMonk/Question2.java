package InternTestVenueMonk;

public class Question2 {
	static int [][] memory; 
	public static void main(String[] args) {
		
		int [] coin = {10,20,50,100,200,500,1000,2000};
		int sum = 2000;
		memory = new int[coin.length+1][sum+1];
		
		System.out.println(count_max_ways(coin,sum,coin.length));
		
	}
	
	private static int count_max_ways(int[] arr, int W, int n) {

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= W; j++) {

				// seeding
				if (i == 0 && j == 0) {
					memory[i][j] = 1;
					continue;
				} else if (j == 0) {
					memory[i][j] = 1;
					continue;
				} else if (i == 0 && j > 0) {
					memory[i][j] = 0;
					continue;
				}

				// making choice
				else if (arr[i - 1] <= j) {
					memory[i][j] = memory[i][j - arr[i - 1]] + memory[i - 1][j];

				} else if (arr[i - 1] > j) {
					memory[i][j] = memory[i - 1][j];

				}

			}
		}
		return memory[n][W];

	}

}
