package dk.via.computer;

public class Program implements Runnable
{
  private String program;
  private String action;
  private int count;
  static private int RUNTIME = 100000;
  public Program (String program, String action, int count){
    this.program = program;
    this.action = action;
    this.count = count;
  }
  @Override public void run()
  {
    for (int i = 0; i < 30; i++)
    {
      System.out.println(program + " wants to " + action);
      try
      {
        Thread.sleep(RUNTIME/30);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
  }
}
