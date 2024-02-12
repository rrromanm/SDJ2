package dk.via.tortoiseHare;

public class Hare implements Runnable
{
  private int meters;
  public Hare(){
    this.meters = 0;
  }
  @Override public void run()
  {
    Tortoise tortoise = new Tortoise();
    for (int i = 0; i < 1000; i++)
    {
      try
      {
        if(meters > tortoise.getMeters())
        meters+=i;
        Thread.sleep(10);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
    System.out.println("Hare finished");
  }
}
