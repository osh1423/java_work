package ch04;

// 전사 클래스 설계 하기
public class Warrior {

	// 상태
	String warriorName;
	int hp;
	int mp;
	int damage;

	// 기능
	public Warrior(String warriorName) {
		this.warriorName = warriorName;
		this.hp = 1000;
		this.mp = 300;
	}

	public void doubleAttack(int damage) {
		this.damage += (150 * damage);
		System.out.println("검은기사가 데미지를" + this.damage + "입혔습니다");
		this.mp -= 30;
		System.out.println("검은기사 마나가" + this.mp + "감소하였습니다");
	}

	public void healHp(int hp) {
		this.hp += (150 * hp);
		System.out.println(this.hp + "만큼 hp를 회복하였습니다.");
	}

	public void defend(int mp) {
		this.hp -= 200;
		System.out.println("공격당하여 hp가" + this.hp + "남았습니다.");
	}

	public void showInfo() {
		System.out.println("상태창");
		System.out.println("이름 : " + this.warriorName);
		System.out.println("체력 : " + this.hp);
		System.out.println("마나 : " + this.mp);
		System.out.println("입힌 데미지 : " + this.damage);
	}

} // end of class
