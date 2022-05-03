import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestLowestNumber {

	public static void main(String args[]) {

		List<Integer> values = Arrays.asList(10, 2, 5, 7, 60, -1, 6, 50, 100);

		Integer SecondHigh = values.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("Second Highest::" + SecondHigh);
		
		
		Integer SecondLow=values.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("Second lowest ::"+SecondLow);

	}

}
