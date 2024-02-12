package dk.via.simplephone;

public class Sound implements SpeakerState
{
  @Override public void click(Phone phone)
  {
    phone.setState(new Vibrant());
  }

  @Override public void alert(Phone phone)
  {
    System.out.println("DRRING");
    phone.setState(this);
  }

  @Override public void volumeUp(Phone phone)
  {
    if(phone.getVolume() < 10){
      phone.setVolume(phone.getVolume()+1);
    }
  }

  @Override public void volumeDown(Phone phone)
  {
    if(phone.getVolume() == 1){
      phone.setVolume(0);
      phone.setState(new Vibrant());
    }
    else if(phone.getVolume() > 0){
      phone.setVolume(phone.getVolume()-1);
    }
  }
}
