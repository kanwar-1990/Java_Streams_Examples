import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddAndEvenNumber {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 4, 57, 89, 9);

		List<Integer> evenNumber = values.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println("even number is " + evenNumber);

		List<Integer> oddNumber = values.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());

		System.out.println("Odd number is " + oddNumber);

	}

}
