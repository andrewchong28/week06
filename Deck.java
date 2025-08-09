package week06FinalCodingProject;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	
	//Constructor: Build Deck
	Deck(){//Constructor: name should the same as class name
	String[] numbers = {"Two", "Three","Four","Five","Six","Seven","Eights","Nine","Ten","Jack","Queen","King","Ace"};
	String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
	
	
	for(String suit : suits) {//enhanced for loop to iterate through suits array
		int value = 2;// variable for value of card - start at 2 for the lowest card
		for(String number : numbers) {//nested for loop to iterate through numbers array
			Card card = new Card(value, number, suit);//using class Card as type, new variable card to reference new instance(object) of Card class, parameters to be passed in 
			cards.add(card); //adds variable card to List cards
			value++;//iterate by one on value of card on each loop
			
		}
		
	}
    
}


	public List<Card> getCards() {
		return cards;
	}



	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {//return type is Card(Class Card) 
		Card card = this.cards.remove(0);// Class Card, new variable card, this.cards.remove(0) = using method .remove(0) remove card position 0 
		return card;                     // card variable will point to the removed card
	}
	
	
}