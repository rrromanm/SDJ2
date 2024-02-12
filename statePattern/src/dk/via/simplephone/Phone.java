package dk.via.simplephone;

public class Phone
{
  private SpeakerState state;
  private int volume;
  public Phone(){
    state = new Sound();
    volume = 5;
  }
  public void onClick(){
    state.click(this);
  }
  public void onMessage(String message){
    System.out.println(message);
    state.alert(this);
  }
  public void onVolumeUp(){
    state.volumeUp(this);
  }
  public void onVolumeDown(){
    state.volumeDown(this);
  }
  int getVolume(){
    return volume;
  }
  void setVolume(int volume){
    this.volume = volume;
  }
  void setState(SpeakerState state){
    this.state = state;
  }
}
