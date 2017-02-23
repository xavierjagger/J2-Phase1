package java2phase1;

import java.util.*;
public class Player {
	
	//Initialize
	private int nHP, nAttack, nDefense, nSpeed;
	
	public Player(int nHP, int nAttack, int nDefense, int nSpeed){
		this.nHP = nHP;
		this.nAttack = nAttack;
		this.nDefense = nDefense;
		this.nSpeed = nSpeed;
	}
	
	//Getters and Setters
	public int getHP() {
		return nHP;
	}

	public void setHP(int nHP) {
		this.nHP = nHP;
	}

	public int getAttack() {
		return nAttack;
	}

	public void setAttack(int nAttack) {
		this.nAttack = nAttack;
	}

	public int getDefense() {
		return nDefense;
	}

	public void setDefense(int nDefense) {
		this.nDefense = nDefense;
	}

	public int getSpeed() {
		return nSpeed;
	}

	public void setSpeed(int nSpeed) {
		this.nSpeed = nSpeed;
	}
	
}