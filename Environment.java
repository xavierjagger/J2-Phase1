package java2phase1;

import java.util.Scanner;

public class Environment {

	private Arena sArena;
	private Swamp sSwamp;
	private Colosseum sColosseum;
	private int nChoice;
	Scanner sc = new Scanner(System.in);
	
	//Setting Environment
	public Environment(Arena sArena, Swamp sSwamp, Colosseum sColosseum){
		this.sArena = sArena;
		this.sSwamp = sSwamp;
		this.sColosseum = sColosseum;
	}//endpublicE

	public void setEnvironment(Arena sArena, Swamp sSwamp, Colosseum sColosseum){
		this.sArena = sArena;
		this.sSwamp = sSwamp;
		this.sColosseum = sColosseum;
	}//endsetE
		
	public String getArena(){
		return sArena.getAChoice();
	}//endgetA
	
	public String getSwamp(){
		return sSwamp.getSChoice();
	}//endgetS
	
	public String getColosseum(){
		return sColosseum.getCChoice();
	}//endgetC
	
	//Get user choice for Environment
	public void checkEnvironment(){
		System.out.println("Please choose your environment:");
		System.out.println("1. Arena");
		System.out.println("2. Swamp");
		System.out.println("3. Colosseum");
		nChoice = sc.nextInt();
		
		if(nChoice == 1){
			System.out.println("You have chosen: Arena");
			System.out.println("No Penalties Applied!");
			}
			else if(nChoice == 2){
			System.out.println("You have chosen: Swamp");
			System.out.println("Poison - Player takes -1 damage.");
			System.out.println("Power Up - Opponent gains +1 atk.");
			}
			else if(nChoice == 3){
			System.out.println("You have chosen: Colosseum");
			System.out.println("Crowd Support - Player gains +1 atk.");
			System.out.println("Intimidated - Opponent loses -1 def.");
			}
	}//endcE
	
	public void environmentPenalty(){
	for(int i = 0; i < 1; i++){
		if(nChoice == 2){
		System.out.println("Warrior has been affected by Poison!");
		}//endif
		}//endfor
	}//endeP
	
}//end