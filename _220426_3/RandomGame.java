package _220426_3;

import _220426_1.ArcadeGame;
import _220426_1.Keypad;
import _220426_1.RPGgame;
//import chapter8.RemoteControl;

public class RandomGame {

	Keypad keypad;
	RPGgame rpg;
	ArcadeGame arcade;
	
	public RandomGame() {
	}

	public RandomGame(Keypad keypad) {
		super();
		this.keypad = keypad;
	}
	
	

}

//	public RandomGame(Keypad keypad){
//		this.keypad = keypad;
//		System.out.println("실행");
//		
//	}
//	
//	
//	MyClass(RemoteControl rc){
//		this.rc = rc;
//		rc.turnOn();
//		rc.setVolume(5);
//	}
