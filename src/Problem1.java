import java.util.*;

public class Problem1 {
	
	static Integer getSum(Collection<Integer> integers) {
		
		Integer num = 0;
	
		Iterator iterator = integers.iterator();
		
		if (!iterator.hasNext()) {
			return 0;
		} else {
			num = (Integer) iterator.next();
			iterator.remove();
			return num + getSum(integers);
		
		}
		
		
		
		/*
		if (!iterator.hasNext()) {
			return 0;
		} else {
			next = (Integer) iterator.next();
			iterator.remove();
			sum = sum + next + add(integers);
			return sum;
		}
		
		
		*/
	}
}
