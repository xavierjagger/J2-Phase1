package java2phase1;

public class Driver {

	public static void main(String[] args) {

		//initialize
		MenuPhase menu = new MenuPhase();
		TurnPhase turn = new TurnPhase();
		
		//call objects
		menu.showMainMenu();
		menu.chooseArmor();
		menu.chooseWeapon();
		menu.chooseOpponent();
		menu.chooseEnvironment();
		turn.battlePhase();
		turn.selectCommand();
	}//endpsvm
	
}//end