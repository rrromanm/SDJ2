package traffic.trafficlight;

public class YellowRed implements TrafficState
{

  @Override public void next(TrafficLight trafficLight)
  {
    trafficLight.setState(new Green());
    trafficLight.turnOff(Lights.RED, Lights.YELLOW);
    trafficLight.turnOn(Lights.GREEN);
  }
}
