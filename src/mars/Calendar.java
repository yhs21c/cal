package mars;

import java.util.Scanner;

public class Calendar {

	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getMaxDay(int mon) {
		return MAX_DAYS[mon-1];
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("원하는 달은?");	
		int mon = scan.nextInt();
	
        System.out.printf("%d월은 %d일까지 있어요",mon,cal.getMaxDay(mon));
		
		scan.close();

		
	}
}
