package dk.via.counter;

public class SynchronizedCounter
{
  private int c = 0;

  public synchronized void increment() {
    for (int i = 0; i < 1000000; i++)
    {
      c++;
    }
    System.out.println(c);
  }
  public synchronized int value() {
    return c;
  }
}
