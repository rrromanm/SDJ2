package dk.via.burgerbar;

public class BurgerbarEmployee implements Runnable
{
  private String name;
  private Burgerbar bar;
  public BurgerbarEmployee(String name, Burgerbar bar){
    this.name = name;
    this.bar = bar;
  }
  @Override public void run()
  {
    while(true){
      try
      {
        bar.makeBurger(name);
        System.out.println("Burger was made by " + name);
        Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
  }
}
