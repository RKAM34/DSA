package LEC27;

import java.util.ArrayList;

public class Dpfibbonacitopupapproacg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(fibotd(3,new int[6]));
		// System.out.println(fibobu(5));
		// System.out.println(fiboBUSE(5));
		// System.out.println(boardpath(1, 10, new int[11]));
		// System.out.println(boardpathbu(4,10 ));
		System.out.println(boardpathSE(0, 10));
	}

	public static int fibotd(int n, int[] strg) {

		if (n == 0 || n == 1) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int f1 = fibotd(n - 1, strg);
		int f2 = fibotd(n - 2, strg);

		strg[n] = f1 + f2;
		return strg[n];

	}

	public static int fibobu(int n) {

		int[] strg = new int[n + 1];

		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i <= n; i++) {

			strg[i] = strg[i - 2] + strg[i - 1];

		}
		return strg[n];

	}

	public static int fiboBUSE(int n) {
		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 0; i < n - 1; i++) {

			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;

		}
		return strg[1];
	}

	public static int boardpath(int curr, int end, int[] strg) {
		if (curr > end) {
			return 0;
		}
		if (curr == end) {
			return 1;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}
		int cnt = 0;
		for (int dice = 1; dice <= 6 && curr + dice <= end; dice++) {
			cnt += boardpath(curr + dice, end, strg);

		}
		strg[curr] = cnt;
		return cnt;

	}

	public static int boardpathbu(int curr, int end) {
		int[] strg = new int[end + 6];
		strg[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			for (int dice = 1; dice <= 6; dice++) {
				strg[i] += strg[i + dice];

			}
		}
		return strg[curr];
	}

	public static int boardpathSE(int curr, int end) {
		int[] strg = new int[6];
		strg[0] = 1;
		for (int i = 1; i <= end; i++) {
			int sum = 0;
			for (int j = 0; j < 6; j++) {
				sum += strg[j];

			}
			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = sum;
		}

		return strg[0];
	}
	


}
