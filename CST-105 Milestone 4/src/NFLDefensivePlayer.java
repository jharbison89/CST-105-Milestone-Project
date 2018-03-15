
public class NFLDefensivePlayer
	extends NFLPlayer{
	
	/* Created by James Harbison
	 * this extends the NFLPlayer class with stats that pertain to a defensive player
	 */
	
	private int tackles;
	private int sacks;
	private int interceptions;
		
	public NFLDefensivePlayer() {
		tackles = 0;
		sacks = 0;
		interceptions = 0;
	}
	
	public NFLDefensivePlayer(String name) {
		tackles = 0;
		sacks = 0;
		interceptions = 0;
		setName(name);
	}
	
	public NFLDefensivePlayer(String name, int tackles, int sacks, int interceptions, int fumbles, int gamesPlayed, int minutesPlayed) {
		this.tackles = tackles;
		this.sacks = sacks;
		this.interceptions = interceptions;
		setName(name);
		setGamesPlayed(gamesPlayed);
		setMinutesPlayed(minutesPlayed);
		setFumbles(fumbles);
	}

	// sets tackles
	void setTackles(int a) {
		tackles = a;
	}
	
	// returns tackles
	int getTackles() {
		return tackles;
	}
	
	// sets sacks
	void setSacks(int a) {
		sacks = a;
	}
	
	// returns sacks
	int getSacks() {
		return sacks;
	}
	
	// sets interceptions
	void setInterceptions(int a) {
		interceptions = a;
	}
	
	// returns interceptions
	int getInterceptions() {
		return interceptions;
	}
	
	// returns tackles per game counting both tackles and sacks as a tackle, if no games are played returns 0
	double getTacklesPerGame() {
		if(getGamesPlayed() != 0) {
			return (double)(tackles + sacks) / (double)getGamesPlayed();
		}
		else {
			return 0;
		}
	}
	
	// returns interceptions per game, if no games are played returns 0
	double getInterceptionsPerGame() {
		if(getGamesPlayed() != 0) {
			return (double)interceptions / (double)getGamesPlayed();
		}
		else {
			return 0;
		}
	}
	
	// returns sacks per game, if no games are played returns 0
	double getSacksPerGame() {
		if(getGamesPlayed() != 0) {
			return sacks / getGamesPlayed();
		}
		else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "Player\t\t" + getName() + "\nGames Played\t" + getGamesPlayed() + "\nMinutes Played\t" + getMinutesPlayed() + "\nFumbles Forced\t" +
				getFumbles() + "\nTackles\t\t" + tackles + "\nSacks\t\t" + sacks + "\nInterceptions\t" + interceptions;
		
	}

	// boolean values to be used by NFLPlayer manager to determine if any given player is offensive or defensive
	public boolean isOffensive() {
		return false;
	}
	
	public boolean isDefensive() {
		return true;
	}
}
