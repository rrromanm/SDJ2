package dk.via.burgerbar;

public class BurgerbarCustomer implements Runnable
{
  private int burgersToEat;
  private String name;
  private Burgerbar bar;
  public BurgerbarCustomer(String name, int burgersToEat, Burgerbar bar){
    this.burgersToEat = burgersToEat;
    this.name = name;
    this.bar = bar;
  }

  @Override public void run()
  {
    for (int i = 0; i < burgersToEat; i++)
    {
      try
      {
        bar.eatBurger(name);
        System.out.println("Burger was eaten by " + name + ". Burgers left: " + bar.getNumberOfBurgers());
        Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
  }
}
