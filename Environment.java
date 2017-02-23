package java2phase1;

import java.util.Scanner;

public class Environment {
	
	private String sEnvironment;
	private int nPlayerPenalty, nOpponentPenalty;
	
    public Environment(String sEnvironment, int nPlayerPenalty, int nOpponentPenalty){
        this.sEnvironment = sEnvironment;
        this.nPlayerPenalty = nPlayerPenalty;
        this.nOpponentPenalty = nOpponentPenalty;
    }

    public String getEnvironment(){
        return sEnvironment;
    }

    public void setEnvironment(String sEnvironment){
        this.sEnvironment = sEnvironment;
    }


    public int getPlayerPenalty(){
        return nPlayerPenalty;
    }

    public void setPlayerPenalty(int nPlayerPenalty){
        this.nPlayerPenalty = nPlayerPenalty;
    }


    public int getOpponentPenalty(){
        return nOpponentPenalty;
    }

    public void setOpponentPenalty(int nOpponentPenalty){
        this.nOpponentPenalty = nOpponentPenalty;
    }
}