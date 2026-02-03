package curriculum.b;

import curriculum.o.Greeting;

public class Main {
	public static void main(String[] args) {
		// Q4
		System.out.println("Q4");
		Greeting greeting = new Greeting();
		greeting.sayHello();
		System.out.println();


		// Q5
		System.out.println("Q5");
		// インスタンスを生成
		Animal animal = new Animal();
		// nameをsetterを使って決める
		animal.setName("ライオン");
		// body決める
		animal.setBody(2.1);
		// speedを決める
		animal.setSpeed(80);
		System.out.println("動物名:" + animal.getName());
		System.out.println("体長:" + animal.getBody() + "m");
		System.out.println("速度:" + animal.getSpeed() + "km/h");
	}
}
