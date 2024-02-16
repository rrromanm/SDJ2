package dk.via.counter;

public class Start
{
  public static void main(String[] args)
  {
    SynchronizedCounter counter = new SynchronizedCounter();
    Counter t1 = new Counter(counter);
    Counter t2 = new Counter(counter);
    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    }
    catch (Exception e) {
      System.out.println("Interrupted");
    }
  }
}
