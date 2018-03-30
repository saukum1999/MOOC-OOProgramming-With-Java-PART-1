/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COMPUTER
 */
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxPlayers;

    public Team(String naam) {
        this.name = naam;
        this.maxPlayers = 16;

    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player p) {
        if (this.players.size() < this.maxPlayers) {
            this.players.add(p);

        }
    }

    public void printPlayers() {
        for (Player a : players) {
            System.out.println(a.getName() + ", goals " + a.goals());
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxPlayers = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    public int goals() {
        int g = 0;
        for (Player b : players) {
            g += b.goals();
        }
        return g;
    }

}
