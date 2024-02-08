package traffic.trafficlight;

public class Red implements TrafficState
{
  @Override public void next(TrafficLight trafficLight)
  {
    trafficLight.setState(new YellowRed());
    trafficLight.turnOn(Lights.YELLOW);;
  }
}
