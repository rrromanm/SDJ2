import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Patient implements PropertyChangeListener
{
  private int ticketNumber;
  public Patient(int pattientNumber){
    this.ticketNumber = pattientNumber - 1;
  }
  public int getTicketNumber() {
    return ticketNumber;
  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    if ("ticketNumber".equals(evt.getPropertyName())) {
      System.out.println("Patient's ticket number changed!");
      System.out.println("Old ticket number: " + evt.getOldValue());
      System.out.println("New ticket number: " + evt.getNewValue());

      // You can add custom logic here to react to the ticket number change
    }
  }
}
