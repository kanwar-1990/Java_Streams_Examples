import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(10, 30, 4, 5, 9, 10, 3, 2, 4, 5);

		/*
		 * Set<Integer> duplicateRemoval = values .stream(). filter(e ->
		 * Collections.frequency(values, e) > 1) .collect(Collectors.toSet());
		 * 
		 * System.out.println("data without duplicate values" + duplicateRemoval);
		 */
		Set<Integer> setValues=new HashSet<Integer>();
		
		Set<Integer> duplicateValue=values.stream().filter(e->!setValues.add(e)).collect(Collectors.toSet());
		
		System.out.println("duplicate value is ::"+duplicateValue);
		
		
		
	}

}
