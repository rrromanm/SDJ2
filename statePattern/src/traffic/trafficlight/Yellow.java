package traffic.trafficlight;

public class Yellow implements TrafficState
{

  @Override public void next(TrafficLight trafficLight)
  {
    trafficLight.setState(new Red());
    trafficLight.turnOff(Lights.YELLOW);
    trafficLight.turnOn(Lights.RED);
  }
}
