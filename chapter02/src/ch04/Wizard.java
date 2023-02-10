package ch04;

public class Wizard {

	// 상태
	String wizardName;
	int hp;
	int mp;
	int damage;

	// 기능
	public Wizard(String wizardName) {
		this.wizardName = wizardName;
		this.hp = 600;
		this.mp = 500;
	}

	public void fireAttack(int damage) {
		this.damage += (250 * damage);
		System.out.println("하얀마법사가 데미지를" + this.damage + "입혔습니다");
		this.mp -= 30;
		System.out.println("하얀마법사 마나가" + this.mp + "감소하였습니다");
	}

	public void healMp(int mp) {
		this.mp += 150;
		System.out.println(this.mp + "만큼 mp를 회복하였습니다.");
	}

	public void defend(int mp) {
		this.hp -= 200;
		System.out.println("공격당하여 hp가" + this.hp + "남았습니다.");
	}

	public void showInfo() {
		System.out.println("상태창");
		System.out.println("이름 : " + this.wizardName);
		System.out.println("체력 : " + this.hp);
		System.out.println("마나 : " + this.mp);
		System.out.println("입힌 데미지" + this.damage);
	}

}
