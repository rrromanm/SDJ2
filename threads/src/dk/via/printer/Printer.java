package dk.via.printer;

import static java.lang.Thread.sleep;

public class Printer implements Runnable
{
  private int numbers;
  public Printer(int numbers){
    this.numbers = numbers;
  }
  @Override public void run()
  {
    for (int i = 0; i < numbers; i++)
    {
      try
      {
        System.out.println(i);
        Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
  }
}
