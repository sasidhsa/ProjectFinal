/*
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * @Saranya Nair
 * @date 7 August 2024
 */
package syst17796_projectcode_final;


import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * 
 */
public abstract class Game {

    private final String name;
    protected ArrayList<Player> players;

    public Game(String name) {
        this.name = name;
        players = new ArrayList<Player>();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    public void addPlayer(Player player) {
    players.add(player);
}


    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public abstract void play();

   
    

}
