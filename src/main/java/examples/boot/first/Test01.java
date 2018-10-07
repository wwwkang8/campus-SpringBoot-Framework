package examples.boot.first;

public class Test01 {
	public static void main(String[] args) {
		//Bus 타입의 인스턴스 객체를 버스라고 취급하여 사용한다.
		//이 때는 버스의 모든 기능을 사용할 수 있다.
		Bus b= new Bus();
		b.a();
		b.run();
		
		//Bus 타입의 인스턴스 객체를 자동차로 취급하여 사용한다.
		//이 때는 자동차로서의 메서드만 사용할 수 있다. Bus 고유의 메서드 사용 불가
		Car c= new Bus();
		//c.a(); Car는 Bus 고유의 메서드인 a 메서드를 사용할 수 없다.
		c.run();
		
		Object obj = new Bus();
		/*
		 * 중요!!
		 * 메서드가 오버라이딩 되면 자식 메서드가 실행된다.
		 * 필드 변수는 오버라이딩이 되지 않는다
		 * */
		
	}
}

abstract class Car{
	public void run(){
		
		System.out.println("run");
	}
}

class Bus extends Car{
	public void a(){
		System.out.println("a");
	}
}