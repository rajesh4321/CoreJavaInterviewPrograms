package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Print2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] names = { {"Sam", "Smith"},
                {"Robert", "Delgro"},
                {"James", "Gosling"},
              };
		
//		Stream.of(names)
//	    .flatMap(Stream::of)
//	        .forEach(System.out::println);
		
		List<List<String>> nameList = new ArrayList<>();
		List<String> name = new ArrayList<>();
		name.add("Sam");
		name.add("Smith");
		nameList.add(name);
		List<String> name1 = new ArrayList<>();
		name1.add("Robert");
		name1.add("Delgro");
		nameList.add(name1);
		List<String> name2 = new ArrayList<>();
		name2.add("James");
		name2.add("Gosling");
		nameList.add(name2);
		
		
		Stream.of(nameList)
			.flatMap(n->n.stream())
			.forEach(s -> System.out.println(s));
		
		nameList.stream()
			.flatMap(n->n.stream())
				.forEach(System.out::println);
	}

}
