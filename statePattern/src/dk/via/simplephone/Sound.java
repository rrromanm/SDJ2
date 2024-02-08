package dk.via.simplephone;

public class Sound implements SpeakerState
{
  public Sound(){

  }
  @Override public void click(Phone phone)
  {
    phone.setState(new Vibrant());
  }

  @Override public void alert(Phone phone)
  {
    System.out.println("DRRING");
    phone.setState(this);
  }
}
