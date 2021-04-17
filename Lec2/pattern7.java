package Lec2;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int rows = 1;
		int nst = 1;
		int val = 1;
		while (rows <= 2 * n - 1)

		{
			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(val);
				}

				cst++;

			}

			System.out.println();
			if (rows < n) {
				nst += 2;
				val++;
			} else {
				nst -= 2;
				val--;
			}

			rows++;

		}

	}
}
