package dk.via.thermometer;

public class Start
{
  public static void main(String[] args)
  {
    Thermometer thermometer1 = new Thermometer("t1", 15, 1);
    Thermometer thermometer2 = new Thermometer("t2", 15, 7);
    Thread t1 = new Thread(thermometer1);
    Thread t2 = new Thread(thermometer2);
    t1.start();
    t2.start();
  }
}
