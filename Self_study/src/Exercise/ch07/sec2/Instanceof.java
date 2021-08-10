package Exercise.ch07.sec2;

public class Instanceof {
	Parent parent = new Parent(); // 애초에 부모 타입으로 생성된 객체이므로
	Child child = (Child) parent; // 강제타입변환이 불가능하다
}
