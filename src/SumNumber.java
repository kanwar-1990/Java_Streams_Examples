import java.util.Arrays;
import java.util.List;

public class SumNumber {
	
	public static void main(String[] args) {
		
	
		List<Integer> values=Arrays.asList(10,20,4,0,50,60,80);
		
		Integer sum=values.stream().reduce((a,b)->(a+b)).get();
		
		System.out.println("Sum value is ::" +sum);
	}

}
