package calendar_;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("월을 입력하세요.");
			System.out.printf("> ");
			
			int month = scanner.nextInt();
			
			// 탈출문
			if (month == -1) {				
				System.out.println("Bye~");
				break;			
			}
			
			// 달력 출력
			System.out.println("  일     월     화    수    목     금     토");
			System.out.print("----------------------------");
			// 1일부터 마지막날까지 숫자 출력
			for(int i=1; i <= MAX_DAYS[month-1]; i++) {
				if(i%7==1) { // 7의 배수일때는 줄바꿈
					System.out.println();	
				}
					System.out.printf("%3d ", i); // 간격에 맞춰 3칸 할당							
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
