package games;

public enum PlateformGame {
	PC, SWITCH, NDS, N3DS, PSP, WII, NOT_PRECISED;

	PlateformGame modify(PlateformGame p) {
			return p;
		}
	
	PlateformGame modify(String s) {
		switch (s) {
		case "PC":
			return PC;
		case "SWITCH":
		case "switch":
			return SWITCH;
		case "NDS":
			return NDS;
		case "N3DS":
			return N3DS;
		case "PSP":
			return PSP;
		case "WII":
			return WII;
		default:
			return NOT_PRECISED;
		}
	}
	
}
