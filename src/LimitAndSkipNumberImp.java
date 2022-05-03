import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkipNumberImp {

	public static void main(String[] args) {
		/**
		 * Important way to use it in getting the first 5 elements in selenium:::
		 */
		List<Integer> values = Arrays.asList(1, 3, 5, 6, 7, 8, 403, 4, 7, 30, 34);

		List<Integer> LimitedValue = values.stream().limit(5).collect(Collectors.toList());

		System.out.println("First 5 limited value is ::" + LimitedValue);
		Integer LimitedValueAndSum = values.stream().limit(5).reduce((p, q) -> (p + q)).get();

		System.out.println("First 5 limited value is ::" + LimitedValueAndSum);

		List<Integer> googlySkip = values.stream().skip(5).collect(Collectors.toList());
		System.out.println("googly Skip ::" + googlySkip);

	}

}
