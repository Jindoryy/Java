




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
