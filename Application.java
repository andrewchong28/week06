package week06FinalCodingProject;

import java.util.ArrayList;

import java.util.List;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//instantiate a deck:
		Deck deck = new Deck();
		
		//shuffle deck:
		deck.shuffle();
		
		//Instantiate 2 players:
		Player player1 = new Player("Bob");
		Player player2 = new Player("Sally");
 
		//Iterate deck 52 times:
        for(int i = 0; i < 52; i++) {
           if(i % 2 == 0) {// player1 draws on even turns and player2 on odd turns
        	   player1.draw(deck); //Remove card at position 0 - call draw() method from Player class to build hand
            } else {
            	player2.draw(deck);
            }
		}
        
        System.out.println("***********************************Player's Hands***********************************");
        player1.describe();
        player2.describe();
        
        
        //Iterate 26 times and call flip method:
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("*********************** Time for War!*****************************");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        
        for(int i = 0; i < 26; i++) {
        	 Card player1CardFlip = player1.flip();
        	 Card player2CardFlip = player2.flip();
        	 
        	 System.out.println(player1.getName() + " flips: "); 
        	 player1CardFlip.describe();
        	 System.out.println(player2.getName() + " flips: "); 
        	 player2CardFlip.describe();
        	 
        	if(player1CardFlip.getValue() > player2CardFlip.getValue()) {
        		player1.incrementScore();
        		System.out.println("-----------------"+"Round "+ (i + 1) + ": "+ player1.getName() +" wins!"+ " **" + player1.getName() +": "+  player1.getScore() + ", " + player2.getName()  +": "+ player2.getScore()+ "**" );
  
        	} else if(player2CardFlip.getValue() > player1CardFlip.getValue()) {
        		player2.incrementScore();
        		System.out.println("-----------------"+"Round "+ (i + 1) + ": " +  player1.getName() +" wins!" + " **" + player2.getName() +": "+  player2.getScore() + ", " + player1.getName()  +": "+ player1.getScore()+ "**" );
        		//System.out.println(player2.getName() + " wins: " + player2CardFlip.getName() +" > "+ player1CardFlip.getName());
        	} else {
        		System.out.println("-----------------"+"Round "+ (i + 1) + ": " +  "Tie no points awarded");
        	}
        	 
        }
       
        System.out.println("**************************Final Score*************************");
        if (player1.getScore() > player2.getScore()) {
        	System.out.println(player1.getName() + " is the winner!");
        	System.out.println("Final score: **" + player1.getName() +": "+  player1.getScore() + ", " + player2.getName()  +": "+ player2.getScore()+ "**"  );
        	
        } else if(player2.getScore() > player1.getScore()) {
        	System.out.println(player2.getName() + " is the winner!");
     		System.out.println("Final score: **" + player2.getName() +": "+  player2.getScore() + ", " + player1.getName()  +": "+ player1.getScore()+ "**"  );
        } else {
        	System.out.println("Draw");
        	System.out.println("Final score: **" + player2.getName() +": "+  player2.getScore() + ", " + player1.getName()  +": "+ player1.getScore()+ "**"  );
        }
 
 

			 

	}

}