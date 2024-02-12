package dk.via.tortoiseHare;

public class Start
{
  public static void main(String[] args)
  {
    Thread t1 = new Thread(new Tortoise());
    Thread t2 = new Thread(new Hare());
    t1.start();
    t2.start();
  }
}
