package java2phase1;

import java.util.Scanner;
public class MenuPhase {

	Scanner sc = new Scanner(System.in);
	private int nUserChoice;
	
	public void showMainMenu(){
		System.out.println("Here comes Bruno Batumbakal!!");
		System.out.println("Do you wish to help Bruno save the world?");
		System.out.println("1. Play");
		System.out.println("2. Exit");
		nUserChoice = sc.nextInt();
	}//setMainMenu
	
	/**if(nUserChoice == 1){
	 * ()load character creation
	 * }
	 * else if(nUserChoice ==2){
	 * 	System.exit(0);
	 * }
	 * 
	 * else{
	 * System.out.println("Invalid choice.");
	 * setMainMenu();
	 * }*/

	
	
}//end