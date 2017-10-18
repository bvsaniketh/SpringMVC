
public class Statistics {
	private int matches;
	private String stadium;
	private int goals;
	
	
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	@Override
	public String toString() {
		return "\n Statistics [matches=" + matches + ", stadium=" + stadium + ", goals=" + goals + "\n"+"]";
	}
	
	
	
}
