package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Parent{
	
	  void test() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	
	 void test() {
		System.out.println("Child");
	}
	
}


/* only private method access specifier will not allow to override 
 * and will not available in other class
 * 
 * default, protected and public method access specifier allow to override 
 * and will be available  in other class
 * 
 * Method declared with final will not override 
 */
public class Inheritance {
	public static void main(String[] args) {
		Parent p =new Child();
		p.test();
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}

		System.out.println(Arrays.toString(array));
		
		List<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("3");
		List<String> list2 = new ArrayList<>();
		list2.add("2");
		list2.addAll(list1);
//		List<String> mergedList = new ArrayList<>(list1);
//		mergedList.addAll(list2);
		System.out.println(list2); // [1, 2]
	}
}
