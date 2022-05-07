package self.maven.p20220504.sort;

public class App_SelectSort {
	public static void main(String[] args) {
		SelectSort select = new SelectSort();

		int[] arr = { 2, 3, 6, 1, 8, 5, 4, 3, 3, 8, 0, 7 };
		
		select.run(arr);
		
//		String[] arrStr = {"dlakfj", "ladfjid", "qqdirjf", "zddn", "aaifj"};
//		select.run(arrStr);

	}
}
