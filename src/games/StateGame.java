package games;

public enum StateGame {
	TO_DO, PLAYING, FINISHED, COMPLETED, ON_HOLD, DROPPED, UNKNOWN;
	
	StateGame modify(StateGame s) {
			return s;
		}
	
	StateGame modify(String s) {
		switch(s) {
			case "To do":
			case "TO DO":
			case "To_do":
			case "TO_DO":
				return TO_DO;
			case "PLAYING":
			case "Playing":
			case "playing":
				return PLAYING;
			case "FINISHED":
			case "Finished":
			case "finished":
				return FINISHED;
			case "COMPLETED":
			case "Completed":
			case "completed":
				return FINISHED;		
			case "ON_HOLD":
			case "On_Hold":
			case "On_hold":
			case "on_hold":
			case "ON HOLD":
			case "On Hold":
			case "On hold":
			case "on hold":
				return ON_HOLD;
			case "DROPPED":
			case "Dropped":
			case "dropped":
				return DROPPED;				
		default:
			return UNKNOWN;
		}
		
		
	}
}
