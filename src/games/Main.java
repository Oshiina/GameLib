package games;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Main {

	public static void main(String[] args) {
		Game j = new Game("Pokemon");
		
		JSONObject gameList = new JSONObject();
		j.addJsonGame(gameList);
		try (FileWriter file = new FileWriter("games.json")) {
			 
            file.write(gameList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
