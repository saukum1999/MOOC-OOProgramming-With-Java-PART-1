/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COMPUTER
 */
public class Player {
    private String playerName;
    private int playerGoals;
    
    public Player(String name) {
        this.playerName = name;
        this.playerGoals = 0;
    }
    
    public Player(String name, int goals) {
        this.playerName = name;
        this.playerGoals = goals;
    }

    Player() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName () {
        return this.playerName;
    }
     
    public int goals() {
        return this.playerGoals;
    }
    
    public String toString () {
        return (this.playerName + ", goals " + this.playerGoals);
    }
}
