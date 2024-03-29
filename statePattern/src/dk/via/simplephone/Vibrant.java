package dk.via.simplephone;

public class Vibrant implements SpeakerState
{
  @Override public void click(Phone phone)
  {
    phone.setState(new Silent());
  }

  @Override public void alert(Phone phone)
  {
    System.out.println("BZZZZ");
    phone.setState(this);
  }

  @Override public void volumeUp(Phone phone)
  {
    phone.setState(new Sound());
  }

  @Override public void volumeDown(Phone phone)
  {

  }
}
