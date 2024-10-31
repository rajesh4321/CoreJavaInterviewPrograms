package test;

public class secondSmallest {
	
	    public static void print2largest(int arr[], int arr_size){
	        int firstMin, secondMin, firstMax, secondMax;
	        firstMin = secondMin = Integer.MAX_VALUE;
	        firstMax = secondMax = Integer.MIN_VALUE;
	     
	        for (int i = 0; i < arr_size; i++) {
	            if (arr[i] < firstMin) {
	                secondMin = firstMin;
	                firstMin = arr[i];
	            }
	            else if (arr[i] < secondMin && arr[i] != firstMin) {
	                secondMin = arr[i];
	            }
	            
	            if (arr[i] > firstMax) {
	                secondMax = firstMax;
	                firstMax = arr[i];
	            }
	            else if (arr[i] > secondMax && arr[i] != firstMax) {
	                secondMax = arr[i];
	            }
	        }

	        System.out.println("The second smallest element"+ " is " + secondMin);
	        System.out.println("The second largest element"+ " is " + secondMax);

	    int highest = Integer.MIN_VALUE;
    	int secondHighest = Integer.MIN_VALUE;
        for (int i : arr) {
    		if (i > highest) {
    			secondHighest = highest;
    			highest = i;
    		} else if (i > secondHighest) {
    			secondHighest = i;
    		}
        }
        
        System.out.println("Highest: "+highest );
        System.out.println("Second Highest: "+secondHighest );

    }
	public static void main(String[] args) {
		
		int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        print2largest(arr, n);
	}

}
