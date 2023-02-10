package ch04;

public class GameTest {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("검은기사");
		warrior.doubleAttack(3);
		warrior.defend(4);
		warrior.healHp(2);
		warrior.showInfo();

		Wizard wizard = new Wizard("하얀마법사");
		wizard.fireAttack(4);
		wizard.defend(1);
		wizard.healMp(2);
		wizard.showInfo();
	}

}
