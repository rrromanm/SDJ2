import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Medic implements PropertyChangeListener
{
  private void medicReaction()
  {
    System.out.println("Medics: DAMN!");
  }
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    if("DreamTeamRoughTackle".equals(evt.getPropertyName()) || "OldBoysRoughTackle".equals(evt.getPropertyName())){
      medicReaction();
    }
  }


}
