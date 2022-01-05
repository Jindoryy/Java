# 참조변수 this란?
- 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다.
- 모든 인스턴스메서드에 지역변수로 숨겨진채로 존재한다.

# 참고
- 'this'를 사용할 수 있는 것은 인스턴스멤버뿐이다. static메서드(클래스 메서드)에서는 인스턴스 멤버들을 사용할 수 없는 것처럼 'this'역시 사용할 수 없다.
왜냐하면, static메서드는 인스턴스를 생성하지 않고도 호출될 수 있으므로 static메서드가 호출된 시점에 인스턴스가 존재하지 않을 수도 있기 때문이다.

-----------------

예시1 - 생성자의 매개변수로 넘어온 값이 인스턴스 변수와 이름이 다를때
```
Car(String c, String g, int d) { // color는 iv, c는 lv
  color = c; // this.color이 생략된 형태이다.
  gearType = g;
  door = d;
}
```
- 변수 color와 c는 이름만으로 서로 구별되므로 'this'를 생략한 경우이다.

예시2 - 생성자의 매개변수로 넘어온 값이 인스턴스 변수와 이름이 같을때
```
Car(String color, String gearType, int door) { // this.color는 iv, color는 lv
  this.color = color;
  this.gearType = gearType;
  this.door = door;
}
```

**주의! - this와 this()는 비슷하게 생겼을 뿐 완전히 다른 것이다. this는 '참조 변수'이고, this()는 '생성자'이다.**
