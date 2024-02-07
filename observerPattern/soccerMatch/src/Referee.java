import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Referee implements PropertyChangeListener
{
  private void dreamTeamRoughTackle()
  {
    System.out.println("Referee gives Dream Team a yellow card for a rough tackle");
  }
  private void oldBoysRoughTackle()
  {
    System.out.println("Referee gives Old Boys a yellow card for a rough tackle");
  }
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    if("DreamTeamRoughTackle".equals(evt.getPropertyName())){
      dreamTeamRoughTackle();
    }
    else if("OldBoysRoughTackle".equals(evt.getPropertyName())){
      oldBoysRoughTackle();
    }
  }



}
