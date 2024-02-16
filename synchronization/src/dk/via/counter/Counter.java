package dk.via.counter;

public class Counter extends Thread
{
  private int count;
  SynchronizedCounter counter;
  Counter(SynchronizedCounter object){
    counter = object;
  }
  public void run(){
    synchronized (counter)
    {
      counter.increment();
    }
  }
}
