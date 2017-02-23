package java2phase1;

import java.util.Scanner;

public class TurnPhase {

	//Initialize
	Scanner sc = new Scanner(System.in);
	private int nTurn, nSkipTurn, nResume, nDMGOutput, nHPReduced, nODMGOutput, nOHPReduced;
	private Armor armor;
	private Environment environment;
	private MenuPhase menu;
	private Opponent opponent;
	private Player player;
	private Weapon weapon;
	
	//Battle Phase (Damage Calculations and Pre-Battle Conditions)
	public void battlePhase(){
		while(player.getHP() == 100 && opponent.getHP() > 0){
			environment.getPlayerPenalty();
			if(environment.getPlayerPenalty() == 1 && environment.getOpponentPenalty() == 1){
			player.setHP(player.getHP() - environment.getPlayerPenalty());
			opponent.setAttack(opponent.getAttack() + environment.getOpponentPenalty());
			System.out.println("The Warrior loses -1 HP from the swamp environment's poison. ");
			System.out.println("Opponent gets +1 ATK from the swamp environment");
			}
			else if(environment.getPlayerPenalty() == 2 && environment.getOpponentPenalty() == 2){
			player.setHP(player.getHP() + environment.getPlayerPenalty());
			opponent.setAttack(opponent.getDefense() - environment.getOpponentPenalty());
			System.out.println("The Warrior gets +1 ATK from the colloseum's crowd support. ");
			System.out.println("Opponent loses -1 DEF from being intimidated");
			}
			System.out.println("Turn " + nTurn);
		}
	}
	
	//Show Character and Opponent HP
	public void showHP(){
		System.out.println("Warrior: " + player.getHP() + " HP");
		System.out.println("Opponent: " + opponent.getHP() + " HP");
	}
	
	//Main Battle Phase
	public void selectCommand(){
		System.out.println("Whatchu gonna do??");
		System.out.println("1. Attack");
		System.out.println("2. Defend");
		System.out.println("3. Charge");
		System.out.println("");
        nTurn = sc.nextInt();
        if(nSkipTurn == 1)
    		System.out.println("Whatchu gonna do??");
    		System.out.println("1. Attack");
    		System.out.println("2. Defend");
    		System.out.println("");
            nTurn = sc.nextInt();
        if(nTurn == 1){
        	System.out.println("You have chosen to Attack");
        	nTurn = sc.nextInt();
        	attack();
        }
        else if(nTurn == 2){
        	System.out.println("You have chosen to Defend");
        	nTurn = sc.nextInt();
        	defend();
        }
        else if(nTurn == 3){
        	System.out.println("You have chosen to Charge");
        	nTurn = sc.nextInt();
        	nSkipTurn = 1;
        	charge();
        }
        
        if(player.getHP() >= 0 && opponent.getHP() <= 0){
        	System.out.println("You are victorious!");
        	System.out.println("Do you wanna play again?");
        	System.out.println("1. Yes");
        	System.out.println("2. No");
        	nResume = sc.nextInt();
        	if(nResume == 1)
        		menu.showMainMenu();
        	else if(nResume == 2)
        		System.exit(0);
        	else
        		selectCommand();
        }
        
        else if(player.getHP() >= 0 && opponent.getHP() <= 0){
        	System.out.println("You have been defeated!");
        	System.out.println("Do you wanna play again?");
        	System.out.println("1. Yes");
        	System.out.println("2. No");
        	nResume = sc.nextInt();
        	if(nResume == 1)
        		menu.showMainMenu();
        	else if(nResume == 2)
        		System.exit(0);
       	}
	}
	
	//Action selection output
	public void attack(){
		nDMGOutput = player.getAttack() - opponent.getDefense();
		System.out.println("You have done " + nDMGOutput + " damage.");
		nOHPReduced = opponent.getHP() - nDMGOutput;
		nOHPReduced = opponent.getHP();
		showHP();
		selectCommand();
	}
	
	public void defend(){
		nODMGOutput = opponent.getAttack() - player.getDefense();
		System.out.println("You have received " + nODMGOutput + " damage.");
		nHPReduced = player.getHP() - nODMGOutput;
		nHPReduced = player.getHP();
		showHP();
		selectCommand();
	}
	
	public void charge(){
		nODMGOutput = opponent.getAttack() - player.getHP();
		System.out.println("You have received " + nODMGOutput + " damage.");
		nHPReduced = player.getHP() - nODMGOutput;
		nHPReduced = player.getHP();
		showHP();
		selectCommand();
		if(nTurn == 3)
			nDMGOutput = (player.getAttack() * 3) - opponent.getDefense();
			nOHPReduced = opponent.getHP() - nDMGOutput;
			nOHPReduced = opponent.getHP();
		showHP();
		selectCommand();
	}

	//Opponent Attack Phase
	public void OpponentPhase(){
		nODMGOutput = opponent.getAttack() - player.getDefense();
		System.out.println("You have received " + nODMGOutput + " damage.");
		nHPReduced = player.getHP() - nODMGOutput;
		nHPReduced = player.getHP();
		showHP();
		selectCommand();
	}
}
