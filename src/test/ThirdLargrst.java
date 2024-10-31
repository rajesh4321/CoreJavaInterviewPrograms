package test;

public class ThirdLargrst {

	static void thirdLargest(int arr[], int arr_size) {

		// Find first largest element
		int first = arr[0];
		for (int i = 1; i < arr_size; i++)
			if (arr[i] > first)
				first = arr[i];

		// Find secon largest element
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr_size; i++)
			if (arr[i] > second && arr[i] < first)
				second = arr[i];

		// Find third largest element
		int third = Integer.MIN_VALUE;
		for (int i = 0; i < arr_size; i++)
			if (arr[i] > third && arr[i] < second)
				third = arr[i];
		
		System.out.printf("The First Largest " + "element is %d\n", first);
		System.out.printf("The Second Largest " + "element is %d\n", second);
		System.out.printf("The third Largest " + "element is %d\n", third);
	}

	public static void main(String[] args) {

		int arr[] = { 12, 35, 1, 10, 34, 1 };
		//1, 1, 10, 12, 34, 35
        int n = arr.length;
        ThirdLargrst.thirdLargest(arr, n);
	}

}
