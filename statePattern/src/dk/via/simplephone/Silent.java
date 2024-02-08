package dk.via.simplephone;

public class Silent implements SpeakerState
{
  public Silent(){

  }
  @Override public void click(Phone phone)
  {
    phone.setState(new Sound());
  }

  @Override public void alert(Phone phone)
  {
    phone.setState(this);
  }
}
