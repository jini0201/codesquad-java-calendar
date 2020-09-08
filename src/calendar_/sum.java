package calendar_;
import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하시오.");
		
		int a,  b;	
		
		//입력 : 키보드로 두 수의 입력을 받는다.
		Scanner scanner = new Scanner(System.in); // 키보드로 입력받음
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1); // int 타입으로 형 변환
		b = Integer.parseInt(s2);
		System.out.println(s1 + ", " + s2);

		
		//출력 : 화면에 두 수의 합을 출력한다.
		int c = a + b;
		System.out.println("두 수의 합은 " + c + "입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다", a, b, a+b);
		scanner.close();
	}

}
