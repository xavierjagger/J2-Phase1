package java2phase1;

public class Driver {

	public static void main(String[] args) {
	
		Arena arena = new Arena();
		Swamp swamp = new Swamp();
		Colosseum colosseum = new Colosseum();
		Environment environment = new Environment(arena, swamp, colosseum);
		MenuPhase menu = new MenuPhase();
		
		menu.showMainMenu();
		environment.checkEnvironment();
	}//endpsvm
	
}//end