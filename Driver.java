package java2phase1;

public class Driver {

	public static void main(String[] args) {

		MenuPhase menu = new MenuPhase();
		TurnPhase turn = new TurnPhase();
		
		menu.showMainMenu();
		menu.chooseArmor();
		menu.chooseWeapon();
		menu.chooseOpponent();
		menu.checkEnvironment();
		menu.beginBattle();
		turn.battlePhase();
		turn.selectCommand();
	}//endpsvm
	
}//end