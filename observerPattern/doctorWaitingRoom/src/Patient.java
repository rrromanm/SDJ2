import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Patient implements PropertyChangeListener
{
  private int ticketNumber;
  private int currentTicket;
  public Patient(int ticketNumber){
    this.ticketNumber = ticketNumber;
  }

  public int getTicketNumber()
  {
    return ticketNumber;
  }
  private void changeNumber()
  {
    if(ticketNumber == currentTicket){
      System.out.println("Patient " + ticketNumber + " enters Doctor's Room");
    }
    else if (ticketNumber > currentTicket){
      System.out.println("Patient " + ticketNumber + " looks up");
      System.out.println("Patient " + ticketNumber + " goes back to looking at phone");
    }
    else{
      System.out.println("Patient " + ticketNumber + " Leaves");
    }
  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    if ("changeNumber".equals(evt.getPropertyName())) {
      currentTicket = (int) evt.getNewValue();
      changeNumber();
      // You can add custom logic here to react to the ticket number change
    }
  }


}
