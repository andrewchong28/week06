package week06FinalCodingProject;

import java.util.ArrayList;
import java.util.List;

import week5.Card;

public class Player {
	List<Card> hand = new ArrayList<Card>();  
	int score;
	String name;
	
	

	//Constructor:
	//Instantiate name only 
	//hand will be empty and score is 0 - no parameters to be passed in
	public Player(String name) {
	    this.name = name;
	    this.hand = new ArrayList<>(); // empty hand at start
	    this.score = 0;                // score starts at 0
	}
	
	
 
	
	public List<Card> getHand() {
		return hand;
	}


	public void setHand(List<Card> hand) {
		this.hand = hand;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void draw(Deck deck) {// pass in Deck deck from Application
	    Card card = deck.draw(); // Take the top card from the deck
	    hand.add(card);          // Put it in the player's hand
	}


	public Card flip() {//return type Class Card, method flip()
	    return hand.remove(0); // /remove first position(0) from hand and returns it
	}  
	
	public void incrementScore() {
	    score++;
	}
	public void describe() {
		 System.out.println("-------------------" + name + " has " + score + " points and the following cards:");
		for(Card card : this.hand) {// for each Class Card variable card in List hand
			card.describe();//call describe method from Card Class
		}
	}
	
}