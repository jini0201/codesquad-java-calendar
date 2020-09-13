package calendar_;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {

		Calendar cal = new Calendar();
		
		System.out.println("반복횟수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int[] number = new int[12];
		
		System.out.println("월을 입력하세요.");
		for(int i=0; i<count; i++) {
			number[i] = scanner.nextInt();
		}
		
		for(int i=0; i<count; i++) {
			System.out.printf("%d월은 %d일까지 있습니다.\n", number[i], cal.getMaxDaysOfMonth(number[i]));
		}
		
	}

}
