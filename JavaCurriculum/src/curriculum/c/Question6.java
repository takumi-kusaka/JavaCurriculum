package curriculum.c;

public class Question6 {
	public static void main(String[] args) {

		System.out.print("グー(0),チョキ(1),パー(2)を入力:");
		int a = new java.util.Scanner(System.in).nextInt();
		if (a == 0) {
			System.out.println("あなたの手:グー");
		} else if (a == 1) {
			System.out.println("あなたの手:チョキ");
		} else if (a == 2) {
			System.out.println("あなたの手:パー");
		}
		Cpu cpu = new Cpu();
		System.out.println("CPUの手:" + cpu.getB());
		switch((a - cpu.b + 3) %3) {
		case 0:
			System.out.println("あいこ");
			break;
		case 1:
			System.out.println("あなたの負け！");
			break;
		case 2:
			System.out.println("あなたの勝ち！");
			break;
		}
		
	}
	
}
