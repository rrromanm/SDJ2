package dk.via.simplephone;

public class Phone
{
  private SpeakerState state;
  public void onClick(){
    state.click(this);
  }
  public void onMessage(String message){
    System.out.println(message);
    state.alert(this);
  }
  void setState(SpeakerState state){
    this.state = state;
  }
}
