package java2phase1;

public class Opponent {
	private String sOpponent;
	private int nHP, nAttack, nDefense, nSpeed;
	
	public Opponent(String sOpponent, int nHP, int nAttack, int nDefense, int nSpeed){
		this.sOpponent = sOpponent;
		this.nHP = nHP;
		this.nAttack = nAttack;
		this.nDefense = nDefense;
		this.nSpeed = nSpeed;
	}
	
	public String getsOpponent() {
		return sOpponent;
	}
	public void setsOpponent(String sOpponent) {
		this.sOpponent = sOpponent;
	}
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
	
	public int attack(Player player, int nPlayerDamDiv){
		int nPlayerDamagedGet = (this.getAttack()-player.getDefense())/nPlayerDamDiv;
		if(nPlayerDamagedGet < 0){
			nPlayerDamagedGet = 0;
		}
		int newPlayerHP = player.getHP()-nPlayerDamagedGet;
		
		if(newPlayerHP<0)
            newPlayerHP = 0;
        
        player.setHP(newPlayerHP);
        
        return nPlayerDamagedGet;
	}
}