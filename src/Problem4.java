
public class Problem4 {
void tableOfSquares (int n, int i) {
	if (i > n) {
		
	} else {
		System.out.println(i + " " + (i*i));
		tableOfSquares (n, i+1);
	}
}
}
