import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		/* Testing if compareTo() for Date objects work to allow sorting according to date natural order....*/
		Date d1 = new Date(6,4,2000);
		Date d2 = new Date(6, 12, 2001);
		Date d3 = new Date(12, 27, 2000);
		Date d4 = new Date(6, 4, 2000);
		
		List<Date> dates = new ArrayList<Date>();
		dates.add(d1);
		dates.add(d2);
		dates.add(d3);
		dates.add(d4);
		
		System.out.println("Unordered dates: " + dates);
		Collections.sort(dates);
		System.out.println("Sorted dates: " + dates);
		
		
		//Problem 3 solution Write a code segment that will write out the value string for every key that is in the month of September, 2002.
		System.out.println("\nProblem 3 Solution: ");
		Date date1 = new Date(9, 3, 2002);
		Date date2 = new Date(10, 6, 2002);
		Date date3 = new Date(11, 10, 2002);
		Date date4 = new Date(12, 13, 2002);
		Date date5 = new Date(1, 17, 2003);
		
		Map<Date, String> syllabus = new TreeMap();
		syllabus.put(date2, "Lesson 2");
		syllabus.put(date4, "Lesson 4");
		syllabus.put(date1, "Lesson 1");
		syllabus.put(date3, "Lesson 3");
		syllabus.put(date5, "Lesson 5");
		
		for (Map.Entry<Date, String> entry : syllabus.entrySet()) {
			if (entry.getKey().month == 9 && entry.getKey().year == 2002) {
				System.out.println(entry.getValue());
			} else {
				System.out.println(entry.getValue() + " is not from September, 2002.");
			}
			
		}
		
		
		
	}

}
