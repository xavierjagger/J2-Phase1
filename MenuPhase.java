package java2phase1;

import java.util.Scanner;
public class MenuPhase {

	Scanner sc = new Scanner(System.in);
	private int nChoice, nUserChoice, nSelectArmor, nSelectWeapon, nSelectOpponent;
	
	private Armor armor;
	private Environment environment;
	private Opponent opponent;
	private Player player;
	private TurnPhase turn;
	private Weapon weapon;
	
	public void showMainMenu(){
		System.out.println("Here comes Bruno Batumbakal!!");
		System.out.println("Do you wish to help Bruno save the world?");
		System.out.println("1. Play");
		System.out.println("2. Exit");
		nUserChoice = sc.nextInt();
		
		if (nUserChoice == 1)
			chooseArmor();
		else if (nUserChoice == 2)
			System.exit(0);
		else
			System.out.println("Invalid Command.");
			showMainMenu();
	}//setMainMenu
	
	public void chooseArmor(){
		System.out.println("Please select your armor: ");
		System.out.println("1. Light Armor - +15 DEF, -5 SPD");
		System.out.println("2. Medium Armor - +25 DEF, -15 SPD");
		System.out.println("3. Heavy Armor - +35 DEF, -25 SPD");
		nSelectArmor = sc.nextInt();
	
		if(nSelectArmor == 1)
			armor = new Armor("Light", 15, -5);
		else if(nSelectArmor == 2)
			armor = new Armor("Medium", 25, -15);
		else if(nSelectArmor == 3)
			armor = new Armor("Heavy", 35, -25);
		else
			System.out.println("Invalid Command.");
			chooseArmor();
	}
	
	public void chooseWeapon(){
		System.out.println("Please select your weapon: ");
		System.out.println("1. Dagger - +20 ATK");
		System.out.println("2. Sword - +30 ATK, -10 SPD");
		System.out.println("3. Battle Axe - +40 ATK, -20 SPD");
		nSelectWeapon = sc.nextInt();
		
		if(nSelectWeapon == 1)
			weapon = new Weapon("Dagger", 20, 0);
		else if(nSelectWeapon == 2)
			weapon = new Weapon("Sword", 25, -15);
		else if(nSelectWeapon == 3)
			weapon = new Weapon("Battle Axe", 35, -25);
		else
			System.out.println("Invalid Command.");
			chooseWeapon();
	}
	
	public void chooseOpponent(){
			System.out.println("Please select your opponent: ");
			System.out.println("1. Thief");
			System.out.println("2. Viking");
			System.out.println("3. Minotaur");
			nSelectOpponent = sc.nextInt();
			
			if(nSelectOpponent == 1)
				opponent = new Opponent("Thief", 150, 20, 10, 40);
			else if(nSelectOpponent == 2)
				opponent = new Opponent("Viking", 250, 30, 20, 30);
			else if(nSelectOpponent == 3)
				opponent = new Opponent("Minotaur", 350, 40, 30, 20);
			else
				System.out.println("Invalid Command.");
				chooseOpponent();
	}
	
	//Get user choice for Environment
	public void checkEnvironment(){
		System.out.println("Please choose your environment:");
		System.out.println("1. Arena");
		System.out.println("2. Swamp");
		System.out.println("3. Colosseum");
		nChoice = sc.nextInt();
		
		if(nChoice == 1)
			environment = new Environment("Arena", 0, 0);
		else if(nChoice == 2)
			environment = new Environment("Swamp", 1, 1);
		else if(nChoice == 3)
			environment = new Environment("Colosseum", 2, 2);
		else
			System.out.println("Invalid Command.");
			checkEnvironment();
	}
		
	public void beginBattle(){
		int nTotalDMG = player.getAttack() + weapon.getAttack(),
		nTotalDEF = player.getDefense() + armor.getDefense(),
		nTotalSPD = player.getSpeed() + armor.getSpeedPenalty() + weapon.getSpeedPenalty();
		player.setAttack(nTotalDMG);
		player.setDefense(nTotalDEF);
		player.setSpeed(nTotalSPD);
		System.out.println("Let the battle begin!");
		turn.battlePhase();
	}
	
}//end