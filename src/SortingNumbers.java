import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNumbers {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(2, 3, 5, 0, 10, 40, 30, 50);

		List<Integer> sortedOrder = values.stream().sorted().collect(Collectors.toList());
		System.out.println("Value sortedOrder is ::" + sortedOrder);

		List<Integer> reverseSortedOrder = values.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());

		System.out.println("Value in reverese sorted order:: "+reverseSortedOrder);
		
	}

}
