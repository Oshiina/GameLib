package games;

import org.json.simple.JSONObject;

public class Game {

	private String name;
	private int note;
	private StateGame state;
	private PlateformGame plateform;

	public Game(String n) {
		name = n;
		note = -1;
		state = StateGame.TO_DO;
		plateform = PlateformGame.NOT_PRECISED;
	}
	
	public Game(String n, PlateformGame Platf) {
		name = n;
		note = -1;
		state = StateGame.TO_DO;
		plateform = Platf;
	}

	public String getName() {
		return name;
	}

	public int getNote() {
		return note;
	}

	public StateGame getState() {
		return state;
	}

	public void noteChange(int n) {
		note = n;
	}

	public void stateChange(StateGame s) {
		state = s;
	}

	/**
	 * Create a json object of the game in order to save it
	 */
	@SuppressWarnings("unchecked")
	private JSONObject createJsonGame() {
		JSONObject gamedetails = new JSONObject();
		if (note == -1)
			gamedetails.put("Note", "Not Marked");
		else
			gamedetails.put("Note", note);
		gamedetails.put("State", state.toString());
		gamedetails.put("Plateform", plateform.toString());
		gamedetails.put("Name", name);
		return gamedetails;
	}

	/**
	 * Add a new game entry to a JSONObject
	 * 
	 * @param games (a list of games, can be empty)
	 * @return the same list, with the new object inside
	 */
	@SuppressWarnings("unchecked")
	public JSONObject addJsonGame(JSONObject games) {
		JSONObject game = createJsonGame();
		games.put(name, game);
		return games;
	}

}
