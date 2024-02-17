package dk.via.thermometer;

public class Start
{
  public static void main(String[] args)
  {
    Thermometer thermometer1 = new Thermometer("t1", 15);
    Thread t1 = new Thread(thermometer1);
    t1.start();
  }
}
