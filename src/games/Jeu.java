package games;

import org.json.simple.JSONObject;

public class Jeu {

	private String name;
	private int note;
	private StateJeu state;

	public Jeu(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public int getNote() {
		return note;
	}

	public StateJeu getState() {
		return state;
	}

	public void noteChange(int n) {
		note = n;
	}

	public void stateChange(StateJeu s) {
		state = s;
	}

	/**
	 * Create a json object of the game in order to save it
	 */
	@SuppressWarnings("unchecked")
	public JSONObject saveGame() {
		JSONObject gamedetails = new JSONObject();
		gamedetails.put("Name", name);
		gamedetails.put("Note", note);
		gamedetails.put("State", state.toString());

		JSONObject game = new JSONObject();
		game.put("game", gamedetails);
		return game;
	}

}
