import java.util.*;

public class Problem1Test {

	public static void main(String[] args) {
		Collection<Integer> integers = new ArrayList<>();
		Integer a = 5;
		Integer b = 100;
		Integer c = 0;
		Integer d = 50;
		integers.add(a);
		integers.add(b);
		integers.add(c);
		integers.add(d);
		System.out.println(Problem1.getSum(integers));
	}

}
