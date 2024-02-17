package dk.via.computer;

public class Mailbox implements Runnable
{
  private int count;
  static private int RUNTIME = 100000;
  public Mailbox(int count){
    this.count = count;
  }

  @Override public void run()
  {
    for (int i = 0; i < 20; i++)
    {
      System.out.println("New mail in your mailbox...");
    }

  }
}
