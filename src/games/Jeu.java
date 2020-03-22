package games;

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
	
	
	
}
