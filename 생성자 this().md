# 생성자란?
- **인스턴스가 생성될 때 호출되는 인스턴스(iv) 초기화 메서드이다.**

# 생성자의 조건

1. 생성자의 이름은 클래스 이름과 같아야 한다.
2. 생성자는 리턴 값이 없다.
3. 모든 클래스는 반드시 생성자를 가져야 한다. - 생성자를 정의하지 않고 인스턴스를 생성하는 경우는 컴파일러가 기본 생성자(default constructor)를 제공하는 경우이다.
-> 기본 생성자가 컴파일러에 의해서 추가되는 경우는 클래스에 정의된 생성자가 하나도 없을 때 뿐이다.

# 매개변수가 있는 생성자
- 생성자도 메서드 처럼 매개변수를 선언하여 호출 시 값을 넘겨받아서 인스턴스의 초기화 작업에 사용할 수 있다.
-> **다양한 생성자를 제공함으로써 인스턴스 생성 후에 별도로 초기화를 하지 않아도 되게 하는 것이 바람직하다.**

예시
```
public class Hello {
	public static void main(String[] args) {

		Car c1 = new Car("white", "auto", 4);
		
		System.out.println(c1.color + ", " + c1.gearType + ", " + c1.door); // while, auto, 4
	}
}

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {} // 기본 생성자
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
```

# 생성자에서 다른 생성자 호출하기 - this()
- 같은 클래스의 멤버들 간의 서로 호출할 수 있는 것처럼 생성자 간에도 서로 호출이 가능하다. 단, 다음의 두 조건을 만족해야 한다.

1. 생성자의 이름으로 클래스이름 대신 this()를 사용한다.
2. 한 생성자에서 다른 생성자를 호출할 때는 **반드시 첫 줄**에서만 호출이 가능하다.

오류
```
Car(String color) {
  door = 5; // 첫번째 줄
  Car(color, "auto", 4); // 에러1. 생성자의 두 번째 줄에서 다른 생성자 호출
                         // 에러2. this(color, "auto", 4);로 해야함
}
```

예시
```
class Car {
	String color;
	String gearType;
	int door;
	
	Car() { // 아무런 매개변수를 받지 못했을 때 호출되며 디폴트 값에 해당한다.
		// Car(String color, String gearType, int door)을 호출
		this("white", "auto", 4);
	}
	
	Car(String color) { 
		// Car(String color, String gearType, int door)을 호출
		this(color, "auto", 5);
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
	}
}
```
- 같은 클래스 내의 생성자들은 일반적으로 서로 관계가 깊은 경우가 많아서 이처럼 서로 호출 하도록 하여 유기적으로 연결해주면 더 좋은 코드를 얻을 수 있다. 그리고 수정이 필요한 경우에 보다 적은 코드만을 변경하면 되므로 유지보수가 쉬워진다.
