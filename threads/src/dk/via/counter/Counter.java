package dk.via.counter;

public class Counter
{
  private int counter;
  public Counter(){
    counter = 0;
  }
  public void incrementCount(){
    counter+=1;
  }
  public int getCount(){
    return counter;
  }
}
