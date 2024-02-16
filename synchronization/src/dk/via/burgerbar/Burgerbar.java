package dk.via.burgerbar;

public class Burgerbar
{
  private int numberOfBurgers;
  private int maxNumberOfBurgers;
  public Burgerbar(int maxNumberOfBurgers){
    this.numberOfBurgers = 0;
    this.maxNumberOfBurgers = maxNumberOfBurgers;
  }
  public synchronized void makeBurger(String employeeName) throws InterruptedException
  {
    numberOfBurgers++;
    while(numberOfBurgers >= maxNumberOfBurgers){
      wait();
    }
    notifyAll();
  }
  public synchronized void eatBurger(String who) throws InterruptedException
  {
    numberOfBurgers--;
    while(numberOfBurgers <= 0){
      wait();
    }
    notifyAll();
  }
  public int getNumberOfBurgers(){
    return numberOfBurgers;
  }
}
