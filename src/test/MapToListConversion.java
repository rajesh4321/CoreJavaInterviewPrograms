package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapToListConversion {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<>();
	      myMap.put(1, "Java");
	      myMap.put(2, "JavaFX");
	      myMap.put(3, "CoffeeScript");
	      myMap.put(4, "TypeScript");
	      
	      List<Entry<Integer, String>> myList = myMap.entrySet().stream().collect(Collectors.toList());
	      
	      System.out.println(myList);
	      
	      myList.stream().forEach(entry->{
	    	  System.out.println("Key: "+entry.getKey()+"\t Values: "+entry.getValue());
	      });
//	      myMap.
	}

}
