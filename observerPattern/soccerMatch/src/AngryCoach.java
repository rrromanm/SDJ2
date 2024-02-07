import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class AngryCoach implements PropertyChangeListener
{
  private void cheer()
  {
    System.out.println("Coach: GOOD JOB DREAM TEAM!");
  }
  private void yell()
  {
    System.out.println("Coach: That's not a yellow card!!!");
  }
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    if("DreamTeamScored".equals(evt.getPropertyName())){
      cheer();
    }
    else if ("DreamTeamRoughTackle".equals(evt.getPropertyName())){
      yell();
    }
  }
}
