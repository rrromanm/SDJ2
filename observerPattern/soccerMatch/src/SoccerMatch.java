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

		Referee referee = new Referee();
		support.addPropertyChangeListener("DreamTeamRoughTackle", referee);
		support.addPropertyChangeListener("OldBoysRoughTackle", referee);

		AngryCoach coach = new AngryCoach();
		support.addPropertyChangeListener("DreamTeamScored", coach);
		support.addPropertyChangeListener("DreamTeamRoughTackle", coach);

		ScoreBoard scoreBoard = new ScoreBoard();
		support.addPropertyChangeListener("OldBoysScored", scoreBoard);
		support.addPropertyChangeListener("DreamTeamScored", scoreBoard);

		Medic medic = new Medic();
		support.addPropertyChangeListener("DreamTeamRoughTackle", medic);
		support.addPropertyChangeListener("OldBoysRoughTackle", medic);

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
			System.out.println("Team 0 made a rough tackle");
			support.firePropertyChange("DreamTeamRoughTackle", null, "Team 0 made a rough tackle");
			// TODO team0 made a rough tackle
		} else {
			System.out.println("Team 1 made a rough tackle");
			support.firePropertyChange("OldBoysRoughTackle", null, "Team 1 made a rough tackle" );
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
