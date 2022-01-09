# 6-19 check




# 6-1
  
class SutdaCard {
  int num;
  boolean isKwang;
}

# 6-2
  
public class Hello {
	public static void main(String[] args) {

		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang ? "K" : "");
	}
}

# 6-3
  
class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
}

# 6-4

public class Hello {
	public static void main(String[] args) {

		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름 :"+s.name);
		System.out.println("총점 :"+s.getTotal());
		System.out.println("평균 :"+s.getAverage());
	}
}

class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)((kor + eng + math) / 3.0f * 10 + 0.5f) / 10.0f;
    // return (int)(getTotal() / 3f * 10 * 5f) / 10f;
	}
}

# 6-5

public class Hello {
	public static void main(String[] args) {

		Student s = new Student("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
	}
}

class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)((kor + eng + math) / 3.0f * 10 + 0.5f) / 10.0f;
	}
}

# 6-6

public class Hello {
	public static void main(String[] args) {

		System.out.println(getDistance(1,1,2,2));
	}
	
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
	}
}

# 6-7
	
class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
	}
}

public class Hello {
	public static void main(String[] args) {

		MyPoint p = new MyPoint(1, 1);
		
		System.out.println(p.getDistance(2, 2));
	}
}

# 6-8
생략

# 6-9
생략

# 6-10 ~ 6-17 
단순 문제

# 6-18
생략

# 6-19
다시한번 볼 필요

# 6-20
	
import java.util.Arrays;


public class Hello {
	
	static int[] shuffle(int[] arr) {
		
		if (arr == null || arr.length == 0) { // 유효성 검사 빼먹지 말기
			return arr;
		}
		
		for (int i = 0; i < arr.length; i++) {
			int idx = (int)(Math.random() * arr.length);
			
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp; 
		}
		
		return arr;
	}
	
	public static void main(String[] args) {

		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}
}

# 6-21

class MyTv {
	boolean isPowerOn;
	int channel;
	int volumn;
	
	final int MAX_VOLUMN = 100;
	final int MIN_VOLUMN = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	void volumnUp() {
		if (volumn < MAX_VOLUMN) {
			volumn++;
		}
	}
	
	void volumnDown() {
		if (volumn > MIN_VOLUMN) {
			volumn--;
		}
	}
	
	void channelUp() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		else {
			channel++;
		}
	}
	
	void channelDown() {
		if (channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		else {
			channel--;
		}
	}
	
}


public class Hello {
	
	public static void main(String[] args) {

		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volumn = 0;
		System.out.println("CH:"+t.channel+", VOL:"+ t.volumn);
		
		t.channelDown();
		t.volumnDown();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volumn);
		
		t.volumn = 100;
		t.channelUp();
		t.volumnUp();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volumn);
	}
}

# 6-22

public class Hello {
	
	static boolean isNumber(String str) {
		if (str == null || str.length() == 0)
			return false;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if ('1' > ch || ch > '9') {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {

		String str = "123";
		System.out.println(str+"은 숫자입니까? "+ isNumber(str));
		
		str = "1234o";
		System.out.println(str+"은 숫자입니까? "+ isNumber(str));
	}
}

# 6-23
	
import java.util.Arrays;

public class Hello {
	
	static int max(int[] arr) {
		
		if (arr == null || arr.length == 0)
			return -999999;
		
		int tmp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (tmp < arr[i]) {
				tmp = arr[i];
			}
		}
		
		return tmp;
	}
	
	public static void main(String[] args) {

		int[] arr = {1, 2, 9, 4, 7};
		
		System.out.println(Arrays.toString(arr));
		System.out.println("최댓값 : " + max(arr));
		System.out.println("최댓값 : " + max(null));
		System.out.println("최댓값 : " + max(new int[] {}));
	}
}

# 6-24

import java.util.Arrays;

public class Hello {
	
	static int abs(int value) {
		return (value >= 0 ? value : -value);
	}
	
	public static void main(String[] args) {

		int value = 5;
		
		System.out.println(value+" 의 절대값 :"+abs(value));
		
		value = -10;
		
		System.out.println(value+" 의 절대값 :"+abs(value));
	}
}
