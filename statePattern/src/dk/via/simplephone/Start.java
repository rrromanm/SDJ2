package dk.via.simplephone;

public class Start
{
  public static void main(String[] args)
  {
    Phone phone = new Phone();
    phone.setState(new Sound());
    phone.onClick();
    phone.onMessage("You have a new notification!");
    phone.onClick();
    phone.onMessage("You have a new notification!");
    phone.onClick();
    phone.onMessage("You have a new notification!");
  }
}
