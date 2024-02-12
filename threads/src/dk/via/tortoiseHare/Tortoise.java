package dk.via.tortoiseHare;

public class Tortoise implements Runnable
{
  private int meters;
  public Tortoise(){
    this.meters = 0;
  }

  public int getMeters()
  {
    return meters;
  }

  @Override public void run()
  {
    for (int i = 0; i < 1000; i++)
    {
      meters+=i;
    }
    System.out.println("Tortoise finished");
  }
}
