package dk.via.simplephone;

public interface SpeakerState
{
  void click(Phone phone);
  void alert(Phone phone);
  void volumeUp(Phone phone);
  void volumeDown(Phone phone);
}
