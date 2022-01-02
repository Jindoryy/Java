3-8 check!



# 3-1
이런거 생략

# 3-2
  
public class Hello {

	public static void main(String[] args) {

		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니 크기
		
		// 모든 사과를 담는데 필요한 바구니의 개수
		int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0);
		
		System.out.println(numOfBucket);
	}
}

# 3-3

public class Hello {

	public static void main(String[] args) {

		int num = 10;
		
		System.out.println(num > 0 ? "양수" : (num == 0 ? "0" : "음수"));
	}
}

# 3-4


public class Hello {

	public static void main(String[] args) {

		int num = 111;
		
		System.out.println(num / 100 * 100);
	}
}

# 3-5
  
public class Hello {

	public static void main(String[] args) {

		int num = 777;
		
		System.out.println(num / 10 * 10 + 1);
	}
}

# 3-6

public class Hello {

	public static void main(String[] args) {

		int num = 24;
		
		System.out.println( (num/10+1) * 10 % num );
	}
}

# 3-7

public class Hello {

	public static void main(String[] args) {

		int fahrenheit = 100;
		float celcius = (int)( 5/9f * (fahrenheit-32) * 100 + 0.5f) / 100f;
		
		System.out.println(fahrenheit);
		System.out.println(celcius);
	}
}

# 3-8

public class Hello {

	public static void main(String[] args) {

		byte a = 10;
		byte b = 20;
		int c = a + b; // 연산을 할땐 int형으로 변환되기 때문에 타입을 바꿔줘야함
		char ch = 'A';
		ch = (char)(ch + 2); // int형으로 변환되기 때문에 캐스팅 해줘야함
		float f = 3 / 2f; // 둘중 한개라도 형변환을 해줘야함
		long l = 3000 * 3000 * 3000l; // int를 3번 곱하는 것이라 오버플로우 발생하기 때문에 long인걸 알려줘야함
		float f2 = 0.1f;
		double d = 0.1; // 
		boolean result = (float)d==f2; // float를 double로 바꾸기엔 유효숫자를 추가해줘야 해서 오차가 발생하기 때문에 double을 float로 형변환 해준다.
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
}

# 3-9

public class Hello {

	public static void main(String[] args) {

		char ch = 'z';
		boolean b = ('a' <= ch && ch <= 'z' || ('A' <= ch && ch <= 'Z' || ('0' <= ch && ch <= '9' )));
		
		System.out.println(b);
	}
}

# 3-10

public class Hello {

	public static void main(String[] args) {

		char ch = 'A';
		
		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch + 32) : ch;
		
		System.out.println(ch);
		System.out.println(lowerCase);
	}
}
