import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ScoreBoard implements PropertyChangeListener
{
  private int dreamscore = 0;
  private int oldboysscore;
  private void team1scored()
  {
    dreamscore+=1;
    System.out.println("\nDream Team: " + dreamscore);
    System.out.println("Old Boys: " + oldboysscore);
  }
  private void team2scored()
  {
    oldboysscore+=1;
    System.out.println("\nDream Team: " + dreamscore);
    System.out.println("Old Boys: " + oldboysscore + "\n");
  }
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    if("DreamTeamScored".equals(evt.getPropertyName())){
      team1scored();
    }
    else if("OldBoysScored".equals(evt.getPropertyName())){
      team2scored();
    }
  }




}
