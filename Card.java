package week06FinalCodingProject;

public class Card {
	
int valueOfCard;
String nameOfCard;


//Constructor
//when new instance of class is created Card card = new Card("8", "Hearts");
//then Card(constructor is invoked/called) it intitalizes the variables with the variables being passed through
//Constructor needs to be same name as class
//When constructor is called set the fields that are in the class
//this. to specify fields in this instance of class
Card(int value, String name, String name1){// parameters for constructors
	this.valueOfCard = value;
	this.nameOfCard = name +" of "+ name1;

}



public int getValue() {
	return valueOfCard;
}

public void setValue(int value) {
	this.valueOfCard = value;
}

public String getName() {
	return nameOfCard;
}

public void setName(String name) {
	this.nameOfCard = name;
}

//Method: describe() to print out fields
public void describe() {
	System.out.println(this.nameOfCard);
}

}
