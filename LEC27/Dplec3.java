package LEC27;

public class Dplec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wines = { 2, 3, 5, 1, 4, };
		int[] matrix = { 1, 2, 3, 4, 5 };
		int prce
		System.out.println(wineprob(wines, 0, wines.length - 1, 1));
		System.out.println(wineprobBU(wines));
		System.out.println(mcm(matrix, 0, matrix.length - 1));
		System.out.println(mcmBU(matrix));
		System.out.println(knapsack(prices, wieght, vidx, cap));
	}

	public static int wineprob(int[] prices, int si, int ei, int yr) {
		if (si == ei) {
			return prices[si] * yr;
		}
		int fh = wineprob(prices, si + 1, ei, yr + 1) + prices[si] * yr;
		int sh = wineprob(prices, si, ei - 1, yr + 1) + prices[ei] * yr;
		return Math.max(fh, sh);

	}

	public static int wineprobTD(int[] prices, int si, int ei, int yr, int[][] strg) {
		if (si == ei) {
			return prices[si] * yr;
		}
		if (strg[si][ei] != 0) {
		}
		int fh = wineprob(prices, si + 1, ei, yr + 1) + prices[si] * yr;
		int sh = wineprob(prices, si, ei - 1, yr + 1) + prices[ei] * yr;
		return Math.max(fh, sh);

	}

	public static int wineprobBU(int[] wines) {
		int n = wines.length;
		int[][] strg = new int[n][n];
		for (int slide = 0; slide < n; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = slide + si;
				int yr = n - ei + si;
				if (si == ei) {
					strg[si][ei] = wines[si] * yr;
					continue;
				}
				int fh = strg[si + 1][ei] + wines[si] * yr;
				int sh = strg[si][ei - 1] + wines[ei] * yr;
				strg[si][ei] = Math.max(fh, sh);
			}

		}
		return strg[0][n - 1];

	}

	public static int mcm(int[] matrix, int si, int ei) {
		if (ei - si == 1) {
			return 0;

		}
		int min = Integer.MAX_VALUE;
		for (int k = si + 1; k <= ei - 1; k++) {
			int fh = mcm(matrix, si, k);
			int sh = mcm(matrix, k, ei);
			int sw = matrix[si] * matrix[k] * matrix[ei];
			int total = fh + sh + sw;

			if (total < min) {
				min = total;
			}
		}

		return min;

	}

	public static int mcmTD(int[] matrix, int si, int ei, int strg[][]) {
		if (ei - si == 1) {
			return 0;

		}
		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}
		int min = Integer.MAX_VALUE;
		for (int k = si + 1; k <= ei - 1; k++) {
			int fh = mcmTD(matrix, si, k, strg);
			int sh = mcmTD(matrix, k, ei, strg);
			int sw = matrix[si] * matrix[k] * matrix[ei];
			int total = fh + sh + sw;

			if (total < min) {
				min = total;
			}
		}

		return strg[si][ei] = min;

	}

	public static int mcmBU(int[] matrix) {
		int n = matrix.length;
		int[][] strg = new int[n][n];
		for (int slide = 1; slide < n; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = slide + si;
				if(si+1==ei) {
					strg[si][ei]=0;
					continue;
				}
				int min = Integer.MAX_VALUE;
				for (int k = si + 1; k <= ei - 1; k++) {
					int fh = strg[si][k];
					int sh = strg[k][ei];
					int sw = matrix[si] * matrix[k] * matrix[ei];
					int total = fh + sh + sw;

					if (total < min) {
						min = total;
					}
				}
				strg[si][ei] = min;

			}
		}
		for(int[] arr:strg) {
			for(int val:arr) {
				System.out.print(val+"\t");
			}
			System.out.println();
		}
		return strg[0][n - 1];

	}
	public static int knapsack(int [] prices,int[]wieght,int vidx,int cap) {
		if(vidx<=wieght.length) {
			return 0;
			
		}
		int exc = knapsack(prices, wieght, vidx+1, cap);
		int inc = 0;
		if(wieght[vidx]<=cap) {
			inc = knapsack(prices, wieght, vidx+1, cap-wieght[vidx]+prices[vidx]);
		}
		return Math.max(exc, inc);
	}

	public static int knapsackTD(int [] prices,int[]wieght,int vidx,int cap, int [][]strg){
		if(vidx<=wieght.length) {
			return 0;
			
		}
		if(strg[vidx][cap]!=0) {
			return 0;
		}
		int exc = knapsackTD(prices, wieght, vidx+1, cap,strg);
		int inc = 0;
		if(wieght[vidx]<=cap) {
			inc = knapsack(prices, wieght, vidx+1, cap-wieght[vidx]+prices[vidx]);
		}
		return strg[vidx][cap]= Math.max(exc, inc);
	}


}