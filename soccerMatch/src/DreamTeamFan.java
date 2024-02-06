import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class DreamTeamFan implements PropertyChangeListener
{
  private void onGoalScored()
  {
    System.out.println("Dream Team Fans: YEEEAAH!");
  }
  private void onGoalMissed()
  {
    System.out.println("Dream Team Fans: buuuuuu!");
  }
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    if ("DreamTeamScored".equals(evt.getPropertyName())) {
      onGoalScored();
    }
    else if ("OldBoysScored".equals(evt.getPropertyName())){
      onGoalMissed();
    }
  }


}
