import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class OldBoysFan implements PropertyChangeListener
{
  private void onGoalScored()
  {
    System.out.println("Old Boys Fans: YEEEAAH!");
  }
  private void onGoalMissed()
  {
    System.out.println("Old Boys Fans: buuuuuu!");
  }
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    if ("OldBoysScored".equals(evt.getPropertyName())) {
      onGoalScored();
    }
    else if ("DreamTeamScored".equals(evt.getPropertyName())){
      onGoalMissed();
    }
  }



}
