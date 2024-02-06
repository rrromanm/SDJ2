import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

public class SoccerMatch implements PropertyChangeListener
{

	private String team0 = "Dream Team";
	private String team1 = "Old Boys";
	private PropertyChangeSupport support;

	public void startMatch() {
		support = new PropertyChangeSupport(this);
		System.out.println("Match starting \n\n");
		Random random = new Random();

		DreamTeamFan dreamTeamFan = new DreamTeamFan();
		support.addPropertyChangeListener("DreamTeamScored", dreamTeamFan);
		support.addPropertyChangeListener("OldBoysScored", dreamTeamFan);

		OldBoysFan oldBoysFan = new OldBoysFan();
		support.addPropertyChangeListener("OldBoysScored", oldBoysFan);
		support.addPropertyChangeListener("DreamTeamScored", oldBoysFan);

		for(int i = 0; i < 90; i++) {

			int rand = random.nextInt(100);
			int whichTeam = random.nextInt(2);

			if(rand < 8) {
				// score goal
				scoreGoal(whichTeam);
			} else if(rand < 12) {
				// penalty
				roughTackle(whichTeam);
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
		}
		
		System.out.println("\n\nMatch ended");
	}

	private void roughTackle(int whichTeam) {
		if(whichTeam == 0) {
			support.firePropertyChange("DreamTeamRoughTackle", null, "Team 0 made a rough tackle");
			System.out.println("Team 0 made a rough tackle");
			// TODO team0 made a rough tackle
		} else {
			support.firePropertyChange("OldBoysRoughTackle", null, "Team 1 made a rough tackle" );
			System.out.println("Team 1 made a rough tackle");
			// TODO team1 made a rough tackle
		}
	}

	private void scoreGoal(int whichTeam) {
		if (whichTeam == 0) {
			System.out.println("Team 0 scored");
			support.firePropertyChange("DreamTeamScored", null, "Team 0 scored");

			// TODO team0 scored
		} else {
			System.out.println("Team 1 scored");
			support.firePropertyChange("OldBoysScored", null, "Team 1 scored");

			// TODO team1 scored
		}
	}

	@Override public void propertyChange(PropertyChangeEvent evt)
	{

	}
}
