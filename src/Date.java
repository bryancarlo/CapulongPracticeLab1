
public class Date implements Comparable<Date> {
	int month;
	int day;
	int year;
	
	Date (int m, int d, int y) {
		this.month = m;
		this.day = d;
		this.year = y;
	}
	
	public int compareTo (Date d) {
		if (year > d.year) {
			return 1;
		} else if (year < d.year) {
			return -1;
		} else if (month > d.month) {
			return 1;
		} else if (month < d.month) {
			return -1;
		} else if (day > d.day) {
			return 1;
		} else if (day < d.day) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		return month +"/" + day + "/" + year;
	}
}
