package mars;

import java.util.Scanner;

public class Calendar {

	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getMaxDay(int mon) {
		return MAX_DAYS[mon-1];
	}
	
	public static void main(String[] args) {
		String prompt="input>";
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
		
	while (true) {
		System.out.println("원하는 달은?");	
		System.out.println(prompt);	
		int mon = scan.nextInt();

		if (mon==-1){
			break;
		}
		if (mon>12){
			continue;
		}
		System.out.printf("%d월은 %d일까지 있어요\n",mon,cal.getMaxDay(mon));

	}
		
		scan.close();

		
	}
}
