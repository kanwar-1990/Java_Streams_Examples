import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {
	
	public static void main(String[] args) {
		
	
	List<Integer> list=Arrays.asList(10,2,4,5,60,70);
	
	
	Integer maxValue=list.stream().max(Comparator.comparingInt(Integer::valueOf)).get();
	
		System.out.println(maxValue);
		
		Integer minValue=list.stream().min(Comparator.comparingInt(Integer::valueOf)).get();
		
		System.out.println(minValue);

		
	}

}
