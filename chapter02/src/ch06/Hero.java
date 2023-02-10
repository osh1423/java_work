package ch06;

public class Hero {
	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die;

	// getter 메서드 직접 만들어 보세요.
	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public double getDefense() {
		return this.defense;
	}

	public boolean getBoolean() {
		return this.die;
	}

	// setter 메서드 직접 만들어 보세요.
	public void setName(String name) {
		if(name == "") {
			System.out.println("다시 입력해주세요.");
		 return;
		}
		this.name = name;
	}

	public void setHp(int hp) {
		if(hp <= 0) {
			System.out.println("잘못된 입력 값 입니다.");
		} else {
			this.hp = hp;			
		}
	}

	public void setPower(int power) {
		if(power <= 0) {
			System.out.println("잘못된 입력 값 입니다.");
		} else {			
			this.power = power;
		}
	}

	public void setDefense(double defense) {
		if(defense <= 0) {
			System.out.println("잘못된 입력 값 입니다.");
		} else {
			this.defense = defense;			
		}
		
	}
	// boolean만 is로 사용한다
	public void isBoolean(boolean die) {
		if(die == false) {
			System.out.println("잘못된 입력 값 입니다.");
		} else {
			this.die = die;						
		}
	}
}
// 방어적 코드도 추가해 보세요