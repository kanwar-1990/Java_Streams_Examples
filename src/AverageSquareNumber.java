import java.util.Arrays;
import java.util.List;

public class AverageSquareNumber {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 10, 40, 50);

		double values1 = values.stream().
				map(e -> e * e).
				 filter(e -> e > 100).
				 mapToInt(e -> e)
				     .average().getAsDouble();
		System.out.println("average square value greater than 100 is " + values1);
		
	}
}
