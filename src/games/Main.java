package games;

import org.json.simple.JSONObject;

public class Main {

	public static void main(String[] args) {
		System.out.println("cc");
		Game j = new Game("lol");
		
		JSONObject gameList = new JSONObject();
		j.addJsonGame(gameList);
	}

}
