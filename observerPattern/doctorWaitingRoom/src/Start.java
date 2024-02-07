public class Start {
  public static void main(String[] args) {
    // Create a WaitingRoom instance
    WaitingRoom waitingRoom = new WaitingRoom();

    // Create and register multiple patients
    Patient patient1 = new Patient(1);
    Patient patient2 = new Patient(2);
    Patient patient3 = new Patient(3);

    waitingRoom.enterWaitingRoom(patient1);
    waitingRoom.enterWaitingRoom(patient2);

    waitingRoom.ding();

    // Print the updated ticket number
    System.out.println("Updated Ticket Number: " + waitingRoom.getCurrentTicketNumber());

    // Attempting to update the ticket number for a patient (will not compile)
    // patient2.setTicketNumber(42);

    // Trigger another ding in the waiting room
    waitingRoom.ding();

    // Print the final ticket number
    System.out.println("Updated Ticket Number: " + waitingRoom.getCurrentTicketNumber());

    // Changes to patients won't be reflected anymore
    // patient1.setTicketNumber(55);  // This line won't compile

    waitingRoom.ding();  // No output for patient changes
  }
}
