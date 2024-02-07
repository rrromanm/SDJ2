import java.beans.PropertyChangeSupport;

public class WaitingRoom
{
  private PropertyChangeSupport support;
  private int currentTicketNumber;
  public WaitingRoom(){
    currentTicketNumber = 0;
    support = new PropertyChangeSupport(this);
  }

  public int getCurrentTicketNumber(){
    return currentTicketNumber;
  }
  public void ding(){
    System.out.println("Diing!");
    currentTicketNumber += 1;

    support.firePropertyChange("changeNumber", currentTicketNumber - 1, currentTicketNumber);
  }
  public void enterWaitingRoom (Patient patient){
    support.addPropertyChangeListener(patient);
    System.out.println("Patient " + patient.getTicketNumber() + " enters waiting room");
  }
  public void leaveWaitingRoom (Patient patient){
    support.removePropertyChangeListener(patient);
    System.out.println("Patient " + patient.getTicketNumber() + " goes to the doctor's room");
  }
}
