import java.util.*;
import java.util.stream.*;

class StreamApi {
	public static void main(String args[])
	{
		List<Integer> number = Arrays.asList(2, 3, 4, 5); 

        number.stream().forEach(y -> System.out.println(y));// 2, 3, 4, 5

		List<Integer> square 
		= number.stream()
			.map(x -> x * x)
			.collect(Collectors.toList());

		List<String> names = Arrays.asList(
			"Reflection", "Collection", "Stream");

		List<String> result
		= names.stream()
			.filter(s -> s.startsWith("S"))
			.collect(Collectors.toList());
	
		System.out.println(result); // [Stream]

		List<String> show 
		= names.stream()
			.sorted()
			.collect(Collectors.toList());
	
		System.out.println(show); // [Collection, Reflection, Stream]

				List<Integer> numbers
			= Arrays.asList(2, 3, 4, 5, 2);

		Set<Integer> squareSet
		= numbers.stream()
			.map(x -> x * x)
			.collect(Collectors.toSet());
	
		System.out.println(squareSet);//[16, 4, 9, 25]

		number.stream()
			.map(x -> x * x)
			.forEach(y -> System.out.println(y));//4, 9, 16, 25


		int even 
		= number.stream()
			.filter(x -> x % 2 == 0)
			.reduce(0, (ans, i) -> ans + i);

		System.out.println(even);//6
	}
}
