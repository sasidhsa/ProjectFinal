/*
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * @Saranya Nair
 * @date 7 August 2024
 */
package syst17796_projectcode_final;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class WarPlayer extends Player {
    private Queue<Card> deck = new LinkedList<>();
    private int roundsWon = 0;

    public WarPlayer(String name) {
        super(name);
    }

    @Override
    public void receiveCard(Card card) { 
        deck.add(card);
    }

    public void receiveCards(List<Card> cards) {
        this.deck.addAll(cards);
    }

    public void incrementRoundsWon() {
        this.roundsWon++;
    }

    public int getRoundsWon() {
        return this.roundsWon;
    }

    public void addCardToDeck(Card card) {
        deck.add(card);
    }

    @Override
    public void play() {
        // Implementation for play method
    }

    @Override
    public Card playCard() {
        return deck.poll();
    }

    @Override
    public boolean hasCards() {
        return !deck.isEmpty();
    }

    public int getDeckSize() {
        return deck.size();
    }

    public void addCardsToDeck(Queue<Card> cards) {
        deck.addAll(cards);
    }

    public Queue<Card> getDeck() {
        return new LinkedList<>(deck); 
    }
}
