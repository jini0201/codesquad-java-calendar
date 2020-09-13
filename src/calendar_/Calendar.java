package calendar_;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {

		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("월을 입력하세요.");
			int month = scanner.nextInt();
			
			if (month == -1) {				
				System.out.println("Have a nice day!");
				break;			
			}
			
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
			
		}
	}

}
