import java.util.Arrays;
import java.util.List;

public class AverageNumber {

	public static void main(String args[]) {

		List<Integer> values = Arrays.asList(10, 20, 30, 40, 50);

		double valuesAsDouble = values.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("Average value is ::" + valuesAsDouble);

	}

}
