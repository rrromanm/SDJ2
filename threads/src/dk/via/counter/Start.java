package dk.via.counter;

public class Start
{
  public static void main(String[] args)
  {
    Counter counter = new Counter();
    CounterIncrementer incrementer = new CounterIncrementer(counter);
    Thread t1 = new Thread(incrementer);
    Thread t2 = new Thread(incrementer);
    t1.start();
    t2.start();
  }
}
