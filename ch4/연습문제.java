4-9 / 4-15 check!
	
	

4-1
단순 조건식 문제 생략

4-2
public class Hello {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i=1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0)
				sum += i;
		}
		
		System.out.println(sum);
	}

}

4-3
public class Hello {

	public static void main(String[] args) {

		int sum = 0;
		int tmp = 0;
				
		for (int i=1; i <= 10; i++) {
			
			tmp += i;
			sum += tmp;
		}
		
		System.out.println(sum);
	}

}

4-4
public class Hello {

	public static void main(String[] args) {

		int sum = 0;
		int s = 1;
		int num = 0;
		
		for (int i=1; sum < 100; i++) {
			
			s = -s;
			num = i * s;
			sum += num;
			

		}
		
		System.out.println(num-1); // i++ 이후 조건식 검사 후 num = i*s 후 다시 i++ 후 조건식을 검사하므로 -1

	}
}

4-5

public class Hello {

	public static void main(String[] args) {

		int i = 0;
		
		while (i <= 10) {
			int j = 0;
			
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			
			System.out.println();
			i++;
		}
	}
}

4-6
public class Hello {

	public static void main(String[] args) {

		for (int i=1; i <= 6; i++) {
			for (int j=1; j <= 6; j++) {
				if (i+j == 6) {
					System.out.println(i+", "+j);
				}
			}
		}
	}
}

4-7
public class Hello {

	public static void main(String[] args) {

		int value = (int)(Math.random() * 6) + 1;
		
		System.out.println(value);
	}
}

4-8
public class Hello {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++ ) {
			for (int j = 0; j <= 10; j++ ) {
				if (2*i + 4*j == 10) {
					System.out.println(i+ ", "+j);
				}
			}
		}
	}
}


4-9
public class Hello {

	public static void main(String[] args) {

		String str = "12345";
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			//sum += (int)str.charAt(i); // 이렇게 하면 아스키 코드 값으로 변해서 틀린다.
			sum += str.charAt(i) - '0'; 
		}
		
		System.out.println(sum);
	}
}

4-10
public class Hello {

	public static void main(String[] args) {

		int num = 12345;
		int sum = 0;
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		System.out.println(sum);
				
		
	}
}

4-11
public class Hello {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1+ ", "+ num2);
		
		for (int i = 0; i < 8; i++ ) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(", "+ num3);
		}
		
	}
}

4-12
굳이 이딴거 해야하나..

4-13
public class Hello {

	public static void main(String[] args) {

		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
		
		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);
			
			if (!('0' <= ch && ch <= '9')) {
				isNumber = false;
			}
		}
		
		if (isNumber)
			System.out.println("숫자입니다.");
		else {
			System.out.println("숫자가아닙니다.");
		}
	}
}

4-14
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {

		int answer = (int)(Math.random() * 100) + 1;
		int input = 0; // 사용자 입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt();
			
			if (answer == input) {
				System.out.println("맞췄습니다.");
				System.out.printf("시도횟수는 %d번입니다.", count);
				break;
			}
			else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			else {
				System.out.println("더 큰 수를 입력하세요.");
			} 
		} while (true);
	}
}

4-15
public class Hello {

	public static void main(String[] args) {

		int number = 12321;
		int tmp = number;
		
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		
		while (tmp != 0) {
			result = result * 10 + tmp % 10; // 기존 결과에 10을 곱해서 더한다.
			tmp /= 10;
		}
		
		if (number == result) {
			System.out.println("회문입니다.");
		}
		else {
			System.out.println("회문수가 아닙니다.");
		}
	}
}
