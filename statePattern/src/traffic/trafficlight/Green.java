package traffic.trafficlight;

public class Green implements TrafficState
{
  @Override public void next(TrafficLight trafficLight)
  {
    trafficLight.setState(new Yellow());
    trafficLight.turnOff(Lights.GREEN);
    trafficLight.turnOn(Lights.YELLOW);
  }
}
